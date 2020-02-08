package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long gameId;
	private String name;
	
	/*
	private String image;
	private String thumbnail;
	private int minPlayers;
	private int maxPlayers;
	private int playingTime;
	private boolean isExpansion;
	private int yearPublished;
	*/
	
	public Game() {}
	
	public Game(String name) {
		super();
		this.name = name;
	}
	/*
	public Game(String name, String image, String thumbnail, int minPlayers, int maxPlayers, int playingTime,
			boolean isExpansion, int yearPublished) {
		super();
		this.name = name;
		this.image = image;
		this.thumbnail = thumbnail;
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
		this.playingTime = playingTime;
		this.isExpansion = isExpansion;
		this.yearPublished = yearPublished;
	}
	*/
	public long getGameId() {
		return gameId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
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
		return isExpansion;
	}
	public void setExpansion(boolean isExpansion) {
		this.isExpansion = isExpansion;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	*/
}
