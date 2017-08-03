package app.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.Location;
import app.persistence.entity.Place;

public interface PlaceRepository extends JpaRepository<Place, Long>
{
	List<Place> findByName(String name);
	List<Place> findByLocation(Location location);
}
