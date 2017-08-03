package app.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.persistence.entity.CombatStats;

public interface CombatStatsRepository extends JpaRepository<CombatStats, Long>
{
}
