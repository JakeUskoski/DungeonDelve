package app.controller;

import org.springframework.web.bind.annotation.RestController;

import app.persistence.entity.Player;
import app.service.IGenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PlayerController {

	@Autowired
	private IGenericService<Player> playerService;
	
    @RequestMapping("/Player")
    public String fetchAll() {
        return playerService.readAll().toString();
    }
    
    @RequestMapping("/Player/{id}")
    public String fetchPlayer(@PathVariable(value = "id") Long id) {
    		return playerService.read(id).toString();
    }

}