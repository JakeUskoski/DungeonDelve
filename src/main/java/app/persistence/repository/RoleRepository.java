package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long>
{
	List<Role> findByName(String name);
}
