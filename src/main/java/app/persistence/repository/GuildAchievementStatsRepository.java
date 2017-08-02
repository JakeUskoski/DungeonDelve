package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.GuildAchievementStats;

public interface GuildAchievementStatsRepository extends CrudRepository<GuildAchievementStats, Long>
{
}
