package app.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.persistence.entity.Guild;
import app.persistence.entity.GuildTitle;

public interface GuildTitleRepository extends CrudRepository<GuildTitle, Long>
{
	List<GuildTitle> findByGuild(Guild guild);
}
