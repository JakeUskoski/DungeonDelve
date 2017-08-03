package app.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.Ailment;

public interface AilmentRepository extends JpaRepository<Ailment, Long>
{
	List<Ailment> findByName(String name);
}
