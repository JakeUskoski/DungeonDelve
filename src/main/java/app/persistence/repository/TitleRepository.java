package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Title;

public interface TitleRepository extends CrudRepository<Title, Long>
{
	List<Title> findByName(String name);
}
