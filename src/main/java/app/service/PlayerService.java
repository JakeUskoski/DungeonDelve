package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.persistence.entity.Account;
import app.persistence.entity.Player;
import app.persistence.repository.PlayerRepository;

public class PlayerService implements IGenericService<Player>{

	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public Player create(Player obj) {
		return playerRepository.save(obj);
	}

	@Override
	public Player update(Player obj) {
		return playerRepository.save(obj);
	}

	@Override
	public void delete(Player obj) {
		playerRepository.delete(obj);
	}

	@Override
	public void delete(long id) {
		playerRepository.delete(id);
	}

	@Override
	public Player read(long id) {
		return playerRepository.findOne(id);
	}

	@Override
	public List<Player> readAll() {
		return playerRepository.findAll();
	}
	
	public List<Player> read(Account account) {
		return playerRepository.findByAccount(account);
	}
}
