import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="office_number")	
	private String officeNumber;
	
	@Column(name="research_area")
	private String researchArea;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	public Professor () {
		
	}

	public Professor(String office_number, String research_area) {
		this.officeNumber = office_number;
		this.researchArea = research_area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOffice_number() {
		return officeNumber;
	}

	public void setOffice_number(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getResearch_area() {
		return researchArea;
	}

	public void setResearch_area(String researchArea) {
		this.researchArea = researchArea;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", officeNumber=" + officeNumber + ", researchArea=" + researchArea
				+ ", customer=" + customer + "]";
	}
	
}
