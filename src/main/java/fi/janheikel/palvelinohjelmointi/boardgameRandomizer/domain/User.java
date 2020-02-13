package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	private String userName;
	private String userEmail;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<UserGame> usergames;
	
	public List<UserGame> getUsergames() {
		return usergames;
	}

	public void setUsergames(List<UserGame> usergames) {
		this.usergames = usergames;
	}

	public User() {}
	
	public User(String userName, String userEmail) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
	}
	public long getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getuserEmail() {
		return userEmail;
	}
	public void setuserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
