package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Guild;

public interface GuildRepository extends CrudRepository<Guild, Long>
{
	List<Guild> findByName(String name);
}
