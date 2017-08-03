package app.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import app.persistence.entity.Account;
import app.persistence.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>
{
	List<Player> findByName(String name);
	List<Player> findByAccount(Account account);
}
