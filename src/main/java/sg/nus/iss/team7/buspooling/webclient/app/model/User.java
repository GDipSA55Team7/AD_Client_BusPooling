package sg.nus.iss.team7.buspooling.webclient.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import sg.nus.iss.team7.buspooling.webclient.app.model.User;

@Entity
@Data
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String password;
	
	private String name;
	
	private Long roleID;
	
	@OneToOne
	private Customer customer;
	
	private Long busCompanyID;
	
	@ManyToOne
	private Role role;
	
}
