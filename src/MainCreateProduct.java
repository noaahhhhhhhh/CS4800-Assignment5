import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreateProduct {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().
				                 configure("hibernate.cfg.xml").
				                 addAnnotatedClass(Order.class).
				                 addAnnotatedClass(Product.class).
				                 buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			session.beginTransaction();
			
			Product product1 = new Product("Book");
			session.save(product1);
			
			Order order1 = new Order(formatter.parse("11/20/2021"), "Ericsson");
			Order order2 = new Order(formatter.parse("11/21/2021"), "John");
			
			product1.addOrders(order1);
			product1.addOrders(order2);
			
			session.save(order1);
			session.save(order2);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			factory.close();
		}		
		
		
	}

}
