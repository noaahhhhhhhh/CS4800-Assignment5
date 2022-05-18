import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainCreate {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().
				                 configure("hibernate.cfg.xml").
				                 addAnnotatedClass(Customer.class).
				                 addAnnotatedClass(Professor.class).
				                 buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			// saving by using professor (owner of the relationship)
			Customer customer = new Customer("Ericsson", "1300 S Pomona");
			
			Professor professor = new Professor("A-1", "Threat Intelligence");			
			
			professor.setCustomer(customer);
			
			session.save(professor);
			

			
			// saving by using customer
			//Professor professor = new Professor("A-1", "Threat Intelligence");
			
			//Customer customer = new Customer("Ericsson", "1300 S Pomon");						
			
			//professor.setCustomer(customer);			
			
			//customer.setProfessor(professor);
			
			//session.save(customer);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			factory.close();
		}		
		
	}	

}
