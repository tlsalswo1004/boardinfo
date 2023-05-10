package com.example.boardinfo.service.game;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.boardinfo.model.game.dao.GameDAO;
import com.example.boardinfo.model.game.dto.GameDTO;

@Service
public class GameServiceImpl implements GameService {

	@Inject
	GameDAO gameDao;
	
	@Override
	public List<GameDTO> gamelist(){
		return gameDao.gamelist();
	}
}
