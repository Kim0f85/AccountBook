package com.project.accountbook.board.post.model;

import java.util.Date;

/*
tblPost
tblAttachedFile
*/
public class PostDTO {
	
	//게시글
	private String seq;
	private String seqBoard;
	private String seqUser;
	private String title;
	private String content;
	private String writeDate;
	private String editDate;
	private int viewCount;
	private int likeCount;
	private int dislikeCount;
	private int reportCount;
	private int secretCheck;
	private int blindCheck;
	
	public PostDTO(
			String seq, 
			String seqBoard, 
			String seqUser, 
			String title, 
			String content, 
			String writeDate,
			String editDate, 
			int viewCount, 
			int likeCount, 
			int dislikeCount, 
			int reportCount, 
			int secretCheck,
			int blindCheck, 
			String seqPost, 
			String fileName, 
			String fileLink) {
		super();
		this.seq = seq;
		this.seqBoard = seqBoard;
		this.seqUser = seqUser;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.editDate = editDate;
		this.viewCount = viewCount;
		this.likeCount = likeCount;
		this.dislikeCount = dislikeCount;
		this.reportCount = reportCount;
		this.secretCheck = secretCheck;
		this.blindCheck = blindCheck;
		this.seqPost = seqPost;
		this.fileName = fileName;
		this.fileLink = fileLink;
	}
	
	public PostDTO() {
		
	}
	
	//첨부파일
	private String seqPost;
	private String fileName;
	private String fileLink;
	
	public String getSeqBoard() {
		return seqBoard;
	}
	public void setSeqBoard(String seqBoard) {
		this.seqBoard = seqBoard;
	}
	public String getSeqUser() {
		return seqUser;
	}
	public void setSeqUser(String seqUser) {
		this.seqUser = seqUser;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String date) {
		this.writeDate = date;
	}
	public String getEditDate() {
		return editDate;
	}
	public void setEditDate(String editDate) {
		this.editDate = editDate;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public int getDislikeCount() {
		return dislikeCount;
	}
	public void setDislikeCount(int dislikeCount) {
		this.dislikeCount = dislikeCount;
	}
	public int getReportCount() {
		return reportCount;
	}
	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}
	public int getSecretCheck() {
		return secretCheck;
	}
	public void setSecretCheck(int secretCheck) {
		this.secretCheck = secretCheck;
	}
	public int getBlindCheck() {
		return blindCheck;
	}
	public void setBlindCheck(int blindCheck) {
		this.blindCheck = blindCheck;
	}
	public String getSeqPost() {
		return seqPost;
	}
	public void setSeqPost(String seqPost) {
		this.seqPost = seqPost;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileLink() {
		return fileLink;
	}
	public void setFileLink(String fileLink) {
		this.fileLink = fileLink;
	}
	
	@Override
	public String toString() {
		return "PostDTO [seqBoard=" + seqBoard + ", seqUser=" + seqUser + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + ", editDate=" + editDate + ", viewCount=" + viewCount + ", likeCount="
				+ likeCount + ", dislikeCount=" + dislikeCount + ", reportCount=" + reportCount + ", secretCheck="
				+ secretCheck + ", blindCheck=" + blindCheck + ", seqPost=" + seqPost + ", fileName=" + fileName
				+ ", fileLink=" + fileLink + "]";
	}
	
}
