package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
	
}
