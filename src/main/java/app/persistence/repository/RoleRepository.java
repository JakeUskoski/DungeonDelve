package app.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>
{
	List<Role> findByName(String name);
}
