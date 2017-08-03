package app.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.Guild;

public interface GuildRepository extends JpaRepository<Guild, Long>
{
	List<Guild> findByName(String name);
}
