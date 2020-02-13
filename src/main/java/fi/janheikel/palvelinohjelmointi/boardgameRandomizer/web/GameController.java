package fi.janheikel.palvelinohjelmointi.boardgameRandomizer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain.Game;
import fi.janheikel.palvelinohjelmointi.boardgameRandomizer.domain.GameRepository;

@Controller
public class GameController {
	@Autowired
	private GameRepository gameRepository;
	
	@RequestMapping(value = {"/", "/gamelist"})
	public String gameList(Model model) {
		model.addAttribute("games", gameRepository.findAll());
		return "gamelist";
	}
	
	@GetMapping("/delete/{gameId}")
	public String deleteGame(@PathVariable("gameId") Long gameId, Model model) {
		gameRepository.deleteById(gameId);
		return "redirect:../gamelist";
	}
	
	@RequestMapping("/addgame")
	public String addGame(Model model) {
		model.addAttribute("game", new Game());
		return "addGame";
	}
	
	@PostMapping("/savegame")
	public String saveGame(Game game) {
		gameRepository.save(game);
		return "redirect:gamelist";
	}
	
	@PostMapping("/updategame/{gameId}")
	public String updateGame(@PathVariable("gameId") long id, Game game, Model model) {
		gameRepository.save(game);
		return "redirect:../gamelist";
	}
	
	@GetMapping(value ="/editgame/{gameId}")
	public String editGame(@PathVariable("gameId") Long gameId, Model model) {
		Game game = gameRepository.findById(gameId).get();
		model.addAttribute("game", game);
		return "editgame";
	}
}
