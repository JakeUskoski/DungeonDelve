package app.persistence.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String email;
	private String username;
	private String password;
	private boolean active;
	
	protected Account() {
	}
}
