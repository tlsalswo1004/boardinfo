package com.example.boardinfo.model.game.dto;

import java.util.Date;

public class GameDTO {

	private int gnum; //테이블 인덱스 pk
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
	
	//getter setter tostring
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public String getGametitle() {
		return gametitle;
	}
	public void setGametitle(String gametitle) {
		this.gametitle = gametitle;
	}
	public String getGametitle_eng() {
		return gametitle_eng;
	}
	public void setGametitle_eng(String gametitle_eng) {
		this.gametitle_eng = gametitle_eng;
	}
	public String getPlayers() {
		return players;
	}
	public void setPlayers(String players) {
		this.players = players;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPlaytime() {
		return playtime;
	}
	public void setPlaytime(String playtime) {
		this.playtime = playtime;
	}
	public String getAges() {
		return ages;
	}
	public void setAges(String ages) {
		this.ages = ages;
	}
	public String getGamephoto() {
		return gamephoto;
	}
	public void setGamephoto(String gamephoto) {
		this.gamephoto = gamephoto;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getG_rate() {
		return g_rate;
	}
	public void setG_rate(double g_rate) {
		this.g_rate = g_rate;
	}
	public double getL_rate() {
		return l_rate;
	}
	public void setL_rate(double l_rate) {
		this.l_rate = l_rate;
	}
	public int getG_rank() {
		return g_rank;
	}
	public void setG_rank(int g_rank) {
		this.g_rank = g_rank;
	}
	@Override
	public String toString() {
		return "GameDTO [gnum=" + gnum + ", gametitle=" + gametitle + ", gametitle_eng=" + gametitle_eng + ", players="
				+ players + ", publisher=" + publisher + ", playtime=" + playtime + ", ages=" + ages + ", gamephoto="
				+ gamephoto + ", release_year=" + release_year + ", write_date=" + write_date + ", language=" + language
				+ ", designer=" + designer + ", category=" + category + ", g_rate=" + g_rate + ", l_rate=" + l_rate
				+ ", g_rank=" + g_rank + "]";
	}
	
	
	

}
