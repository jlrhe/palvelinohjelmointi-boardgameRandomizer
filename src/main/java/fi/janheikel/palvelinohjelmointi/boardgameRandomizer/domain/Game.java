package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long gameId;
	private String name;
	//private String imageUrl;
	//private String thumbnailUrl;
	private int minPlayers;
	private int maxPlayers;
	private int playingTime;
	private boolean isExpansion;
	private int yearPublished;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "game")
	private List<UserGame> gameusers;
	
	
	public List<UserGame> getGameusers() {
		return gameusers;
	}

	public void setGameusers(List<UserGame> gameusers) {
		this.gameusers = gameusers;
	}

	public Game() {
		super();
		this.name = "name";
		//this.imageUrl = "";
		//this.thumbnailUrl = "";
		this.minPlayers = 0;
		this.maxPlayers = 99;
		this.playingTime = 0;
		this.isExpansion = false;
		this.yearPublished = 0;
	}
	
	public Game(String name) {
		super();
		this.name = name;
		//this.imageUrl = "";
		//this.thumbnailUrl = "";
		this.minPlayers = 0;
		this.maxPlayers = 99;
		this.playingTime = 0;
		this.isExpansion = false;
		this.yearPublished = 0;
	}
	
	public Game(String name, String imageUrl, String thumbnailUrl, int minPlayers, int maxPlayers, int playingTime,
			boolean isExpansion, int yearPublished) {
		super();
		this.name = name;
		//this.imageUrl = imageUrl;
		//this.thumbnailUrl = thumbnailUrl;
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
		this.playingTime = playingTime;
		this.isExpansion = isExpansion;
		this.yearPublished = yearPublished;
	}
	
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId=gameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	public String getImage() {
		return imageUrl;
	}
	public void setImage(String image) {
		this.imageUrl = image;
	}
	public String getThumbnail() {
		return thumbnailUrl;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnailUrl = thumbnail;
	}
	*/
	public int getMinPlayers() {
		return minPlayers;
	}
	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}
	public int getMaxPlayers() {
		return maxPlayers;
	}
	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
	public int getPlayingTime() {
		return playingTime;
	}
	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}
	public boolean isExpansion() {
		return this.isExpansion;
	}
	public void setIsExpansion(boolean isExpansion) {
		this.isExpansion = isExpansion;
	}
	public boolean getIsExpansion() {
		return this.isExpansion;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
}
