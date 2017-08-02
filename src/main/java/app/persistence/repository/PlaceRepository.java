package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Place;

public interface PlaceRepository extends CrudRepository<Place, Long>
{
	List<Place> findByName(String name);
}
