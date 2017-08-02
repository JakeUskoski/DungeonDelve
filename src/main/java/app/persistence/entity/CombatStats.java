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
	
	private long strength;
	private long constitution;
	private long endurance;
	private long dexterity;
	private long intellect;
	private long wisdom;
	private long charisma;
	
	private List<Ailment> ailments;
	
	protected CombatStats() {
	}
	
	public CombatStats(long strength, long constitution, long endurance, long dexterity, long intellect, long wisdom, long charisma) {
		this.strength = strength;
		this.constitution = constitution;
		this.endurance = endurance;
		this.dexterity = dexterity;
		this.intellect = intellect;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}
}
