package app.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String effect;
	
	private Double baseValue;
	private Double multiplier1;
	private String multiplierStat1;
	private Double multiplier2;
	private String multiplierStat2;
	
	protected Skill() {
	}
	
	public Skill(String name) {
		this.name = name;
	}
}
