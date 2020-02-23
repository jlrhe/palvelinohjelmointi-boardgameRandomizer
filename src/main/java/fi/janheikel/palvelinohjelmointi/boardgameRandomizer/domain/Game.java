package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Game {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //when importing games from boardgamegeek(bgg)-database there is a risk of duplicate keys. I'll tackle this when/if I implement importing from bgg.
	@NotNull
	private long gameId;
	
	@Size(min=2, max=100)
	@NotBlank
	private String name;
	
	// image and thumbnail will most likely not be implemented as part of this course
	//private String imageUrl;
	//private String thumbnailUrl;
	
	//in the following a value of 0 denotes unknown
	
	@NotNull
	@Min(0)
	@Max(2147483647)//max just to prevent integer overflow, in theory there could be games with potentially limitless participant count 
	private int minPlayers;
	
	@NotNull
	@Min(0)
	@Max(2147483647)//max just to prevent integer overflow, in theory there could be games with potentially limitless participant count 
	private int maxPlayers;
	
	@NotNull
	@Min(0)
	@Max(2147483647)//max just to prevent integer overflow, in theory there could be games with potentially limitless participant count 
	private int playingTime;
	
	@NotNull
	private boolean isExpansion;
	
	@NotNull
	@Min(-2147483648)
	@Max(2147483647)//max just to prevent integer overflow, in theory there could be games with potentially limitless participant count 
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
