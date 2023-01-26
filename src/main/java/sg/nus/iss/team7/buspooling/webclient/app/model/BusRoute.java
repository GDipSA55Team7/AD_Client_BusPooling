package sg.nus.iss.team7.buspooling.webclient.app.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class BusRoute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String busRouteName;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private double fare;
	
	@ManyToOne
	private BusGroup busGroup;
	
	private int maxCapacity;
	
	@ManyToOne
	private BusCompany busCompany;
	
	@OneToMany(mappedBy="busRoute")
	private List<BusRouteDetail> busRouteDetail;
	
	


}
