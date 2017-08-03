package app.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.GuildAchievementStats;

public interface GuildAchievementStatsRepository extends JpaRepository<GuildAchievementStats, Long>
{
}
