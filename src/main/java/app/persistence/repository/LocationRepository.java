package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Long>
{
	List<Location> findByName(String name);
}
