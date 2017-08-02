package app.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.CombatStats;

public interface CombatStatsRepository extends CrudRepository<CombatStats, Long>
{
}
