package app.resource.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	protected Player()
	{
	}

	public Player(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return String.format(
				"Player[id=%d, firstName='%s']",
				id, name);
	}
}
