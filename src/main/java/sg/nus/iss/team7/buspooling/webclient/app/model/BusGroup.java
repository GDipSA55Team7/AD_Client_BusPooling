package sg.nus.iss.team7.buspooling.webclient.app.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class BusGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String status;
	
	@OneToMany(mappedBy="busGroup")
	private List<BusRoute> busRoutes;
	
	@OneToMany(mappedBy="busGroup")
	private List<BusGroupDetails> busGroupDetails;

}
