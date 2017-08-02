package app.persistence.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CombatStats {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Double strength;
	private Double constitution;
	private Double endurance;
	private Double dexterity;
	private Double intellect;
	private Double wisdom;
	private Double charisma;
	
	private List<Ailment> ailments;
	
	protected CombatStats() {
	}
	
	public CombatStats(Double strength, Double constitution, Double endurance, Double dexterity, Double intellect, Double wisdom, Double charisma) {
		this.strength = strength;
		this.constitution = constitution;
		this.endurance = endurance;
		this.dexterity = dexterity;
		this.intellect = intellect;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}
}
