package app.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private Long type;
	private Location location;
	
	protected Place() {
	}
	
	public Place(String name, Long type, Location location) {
		this.name = name;
		this.type = type;
		this.location = location;
	}
}
