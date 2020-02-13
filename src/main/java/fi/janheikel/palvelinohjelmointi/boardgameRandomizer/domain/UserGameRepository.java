package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain;

import org.springframework.data.repository.CrudRepository;

public interface UserGameRepository extends CrudRepository<UserGame, Long>{
	
}
