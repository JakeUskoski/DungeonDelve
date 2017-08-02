package app.persistence.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GuildAchievementStats {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long totalGold;
	private Long membersRecruited;
	private Long membersLeft;
	private Long membersRemoved;
	private Long rank;
	private Date dtmCreated;
	private Date dtmDisbanded;
	
	protected GuildAchievementStats() {
	}
}
