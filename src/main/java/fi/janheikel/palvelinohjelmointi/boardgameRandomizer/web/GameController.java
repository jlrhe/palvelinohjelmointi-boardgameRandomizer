package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain.GameRepository;

@Controller
public class GameController {
	@Autowired
	private GameRepository repository;
	
	@RequestMapping("/gamelist")
	public String gameList(Model model) {
		model.addAttribute("games", repository.findAll());
		return "gamelist";
	}
}
