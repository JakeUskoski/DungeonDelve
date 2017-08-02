package app.persistence.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ailment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private double value;
	
	private String operator;
	private String stat;
	
	protected Ailment() {
	}
	
	public Ailment(String name, double value, String operator, String stat) {
		this.name = name;
		this.value = value;
		this.operator = operator;
		this.stat = stat;
	}
}
