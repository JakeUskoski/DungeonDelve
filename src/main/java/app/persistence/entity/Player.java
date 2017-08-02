package app.persistence.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Player
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private Long accountId;
	
	private String name;
	
	private Long level;
	
	private Role role;
	private Title title;
	
	//Stats
	private Long strength;
	private Long constitution;
	private Long endurance;
	private Long dexterity;
	private Long intellect;
	private Long wisdom;
	private Long charisma;
	private Long unassigned;
	
	private CombatStats combatStats;
	
	private Guild guild;
	
	private GuildTitle guildTitle;
	
	@OneToMany(mappedBy = "title", cascade = CascadeType.ALL)
	private Set<Title> titles;
	
	private Set<Skill> skills;
	
	private AchievementStats achievementStats;
	
	private Location location;
	
	private Long Gold;
	
	protected Player()
	{
	}

	public Player(String name)
	{
		this.name = name;
	}
}
