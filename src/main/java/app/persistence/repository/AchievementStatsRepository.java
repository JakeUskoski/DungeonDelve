package app.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.persistence.entity.AchievementStats;

public interface AchievementStatsRepository extends JpaRepository<AchievementStats, Long>
{
}
