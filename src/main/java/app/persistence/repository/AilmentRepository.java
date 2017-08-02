package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Ailment;

public interface AilmentRepository extends CrudRepository<Ailment, Long>
{
	List<Ailment> findByName(String name);
}
