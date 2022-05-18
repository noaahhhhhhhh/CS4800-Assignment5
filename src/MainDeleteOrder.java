import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainDeleteOrder {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Order.class).
                addAnnotatedClass(Product.class).
                buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Product product1 = session.get(Product.class, 8);
			
			session.delete(product1);
			
			session.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			factory.close();
		}
		
	}
	
}
