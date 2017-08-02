package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.CombatStats;

public interface CombatStatsRepository extends CrudRepository<CombatStats, Long>
{
}
