package fi.janheikel.palvelinohjelmointi.boardgameRandomizer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain.Game;
import fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain.GameRepository;
import fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain.User;
import fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain.UserRepository;

@SpringBootApplication
public class BoardgameRandomizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardgameRandomizerApplication.class, args);
	}
	
	/*
	@Bean
	public CommandLineRunner demo1(UserRepository repository) {
		return (args) -> {
			User user1 = new User("Test1", "test1@test.fi");
			User user2 = new User("Test2", "test2@test.fi");
			User user3 = new User("Test3", "teat3@test.fi");
			
			repository.save(user1);
			repository.save(user2); 
			repository.save(user3);
		};
	}
	
	@Bean
	public CommandLineRunner demo2(GameRepository repository) {
		return (args) -> {
			Game game1 = new Game("Game1");
			Game game2 = new Game("Game2");
			Game game3 = new Game("Game3");
			
			repository.save(game1);
			repository.save(game2); 
			repository.save(game3);
		};
	}*/
}
