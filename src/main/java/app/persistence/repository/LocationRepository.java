package app.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long>
{
	List<Location> findByName(String name);
}
