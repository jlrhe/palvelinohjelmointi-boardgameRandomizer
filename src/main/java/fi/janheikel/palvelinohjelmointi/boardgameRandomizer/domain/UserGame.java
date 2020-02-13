package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserGame {
	//composite id would be better. I'll refactor if I have time...
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userGameId;
	
	@ManyToOne
	@JoinColumn(name = "user")
	private User user;

	@ManyToOne
	@JoinColumn(name = "game")
	private Game game;
	
	
	
	public UserGame() {
		super();
	}

	public UserGame(User user, Game game) {
		super();
		this.user = user;
		this.game = game;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public long getUserGameId() {
		return userGameId;
	}

}
