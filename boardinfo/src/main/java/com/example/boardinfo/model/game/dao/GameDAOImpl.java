package com.example.boardinfo.model.game.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.boardinfo.model.game.dto.GameDTO;

@Repository
public class GameDAOImpl implements GameDAO {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<GameDTO> gamelist(){
		return sqlSession.selectList("game.gameList");
	}
}
