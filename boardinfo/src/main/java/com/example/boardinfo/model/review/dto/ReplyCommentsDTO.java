package com.example.boardinfo.model.review.dto;

public class ReplyCommentsDTO {

	private String replyRegNum;		// 댓글 테이블 PK
	private String regNum;			// 리뷰 테이블 PK
	private String topReplyRegNum;	// 상위 댓글 키 → 값이 들어가 있으면 댓글의 답글로 처리됨
	private String commentDetail;	// 댓글 내용
	private String del;				// 삭제 여부 (기본값 : N)
	private String createUser;		// 등록자
	private String createDate;		// 등록 일자
	private String updateUser;		// 수정자
	private String updateDate;		// 수정 일자

	public String getReplyRegNum() {
		return replyRegNum;
	}

	public void setReplyRegNum(String replyRegNum) {
		this.replyRegNum = replyRegNum;
	}

	public String getRegNum() {
		return regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public String getTopReplyRegNum() {
		return topReplyRegNum;
	}

	public void setTopReplyRegNum(String topReplyRegNum) {
		this.topReplyRegNum = topReplyRegNum;
	}

	public String getCommentDetail() {
		return commentDetail;
	}

	public void setCommentDetail(String commentDetail) {
		this.commentDetail = commentDetail;
	}

	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}

