package com.example.boardinfo.controller.game;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.boardinfo.service.game.GameService;

@Controller
@RequestMapping("game/*")
public class GameController {
	@Inject
	GameService gameService;
	
	@RequestMapping("gamelist.do")
	public ModelAndView gamelist(ModelAndView mav) {
		mav.setViewName("game/game_list");
		mav.addObject("list", gameService.gamelist());
		return mav;
	}
}
