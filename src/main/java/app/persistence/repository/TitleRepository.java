package app.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.Title;

public interface TitleRepository extends JpaRepository<Title, Long>
{
	List<Title> findByName(String name);
}
