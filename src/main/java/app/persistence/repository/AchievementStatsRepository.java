package app.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.AchievementStats;

public interface AchievementStatsRepository extends CrudRepository<AchievementStats, Long>
{
}
