import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainDelete {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Customer.class).
                addAnnotatedClass(Professor.class).
                buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Customer costumer = session.get(Customer.class, 17);
			
			session.delete(costumer);
			
			session.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			factory.close();
		}
		
	}
	
}
