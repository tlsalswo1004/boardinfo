package com.example.boardinfo.controller.chat;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


public class ChatHandler extends TextWebSocketHandler {
	
	private static final org.slf4j.Logger logger = 
			LoggerFactory.getLogger(ChatController.class);

	private List<WebSocketSession> sessionList = new ArrayList<WebSocketSession>();


	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("여기로 오긴 왔니? connection");
		logger.info("#ChatHandler, afterConnectionEstablished");
		sessionList.add(session); 
		logger.info("1234님이 입장하셨습니다.");
	}

	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("여기로 오긴 왔니? handleText");
		logger.info("#ChattingHandler, handleMessage");
		logger.info("1234: " + message);
		
		
		for(WebSocketSession s : sessionList) {
			s.sendMessage(new TextMessage("1234: " + message.getPayload()));
		}
		
	}

	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("연결끊김");
		logger.info("#ChattingHandler, afterConnectionClosed");
		sessionList.remove(session); 
		logger.info(session.getPrincipal().getName() + "님이 퇴장하셨습니다.");
		
	}


	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		System.out.println("에러발생");
	}
	
	
	


	
	

}
