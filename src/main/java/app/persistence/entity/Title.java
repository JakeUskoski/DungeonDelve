package app.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Title {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private boolean isUnique;
	
	protected Title() {
	}
	
	public Title(String name, boolean isUnique) {
		this.name = name;
		this.isUnique = isUnique;
	}
}
