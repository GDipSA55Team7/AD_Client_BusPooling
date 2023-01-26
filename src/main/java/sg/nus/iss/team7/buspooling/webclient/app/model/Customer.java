package sg.nus.iss.team7.buspooling.webclient.app.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
			
	private String name;
	
	private String email;
	
	private String address;
	
	private String postalCode;
	
	private String latitude;
	
	private String longitude;
	
	@OneToOne(mappedBy="customer")
	private User user;
	
	@OneToMany(mappedBy="customer")
	private List<BusPass> busPasses;
	
	@OneToMany(mappedBy="customer")
	private List<BusGroupDetails> busGroupDetails;
}
