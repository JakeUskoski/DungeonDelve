package app.persistence.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guild {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private Set<Player> members;
	
	private Long gold;
	
	private GuildAchievementStats guildAchievementStats;
	
	protected Guild() {
	}
	
	public Guild(String name) {
		this.name = name;
	}
}
