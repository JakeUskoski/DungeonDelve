package app.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>
{
	List<Skill> findByName(String name);
}
