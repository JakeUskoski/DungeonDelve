package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>
{
	List<Player> findByName(String name);
}
