package app.resource.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.resource.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>
{
	List<Player> findByName(String name);
}
