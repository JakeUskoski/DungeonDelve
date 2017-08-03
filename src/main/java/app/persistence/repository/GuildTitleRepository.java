package app.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import app.persistence.entity.Guild;
import app.persistence.entity.GuildTitle;

public interface GuildTitleRepository extends JpaRepository<GuildTitle, Long>
{
	List<GuildTitle> findByGuild(Guild guild);
}
