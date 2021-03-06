package app.persistence.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private Set<Location> connections;
	
	protected Location() {
	}
	
	public Location(String name, Set<Location> connections) {
		this.name = name;
		this.connections = connections;
	}
}
