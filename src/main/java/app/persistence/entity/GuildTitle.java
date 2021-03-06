package app.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GuildTitle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Guild guild;
	private String name;
	private Long position;
	
	protected GuildTitle() {
	}
	
	public GuildTitle(Guild guild, String name, Long position) {
		this.guild = guild;
		this.name = name;
		this.position = position;
	}
}
