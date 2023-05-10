package com.example.boardinfo.model.game.dto;

import java.util.Date;

public class GameDTO {

	private int gamenum; //테이블 인덱스 pk
	private String gametitle; //게임명 nn
	private String gametitle_eng; //게임명 영문 
	private String players; //인원 nn 모르면 정보없음입력
	private String publisher; //제작사 nn 모르면 정보없음입력
	private String playtime; //플레이시간 nn 모르면 정보없음입력
	private String ages; //사용연령 nn 모르면 정보없음입력
	private String gamephoto; //게임사진파일명 
	private int release_year; //게임발매년도 
	private Date write_date; //업로드날짜 nn sysout기본
	private String language; //언어 nn
		
		
	//따로 테이블 만들어서 관리.
	private String designer; //디자이너 nn 모르면 정보없음입력
	//따로 테이블 만들어서 관리.
	private String category; //게임카테고리

		
	//테이블에 없을것들 일단 적어놨지만 나중에 dto가 아닌 map으로 값 넘길수도 있음.
	private double g_rate; //게임 평점
	private double l_rate; //게임 난이도
	private int g_rank; //게임순위


}
