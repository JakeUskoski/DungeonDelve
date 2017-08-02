package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Skill;

public interface SkillRepository extends CrudRepository<Skill, Long>
{
	List<Skill> findByName(String name);
}
