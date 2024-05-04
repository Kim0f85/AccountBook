package com.project.accountbook.account.model;

/*
tblAccInfo
tblAcc
tblPurchaseWishList
tblFixedDepositWithdrawalCheck
tblAccCategoryList
tblReasonChangeCategory
tblCardInformation
tblMyCard
*/
public class AccountInfoDTO {
	
	//가계부 내용
	private String content;
	private String accInfoDate;
	private int price;
	private String location;
	private String seqAcc;
	private String seqReasonChangeCategory;
	private String seqFixedFluctuationCheck;
	private String seqDepositWithdrawalStatus;
	
	private int totalPrice;
	
	//가계부
	private String idMember;
	
	//구매 위시 목록
	private String productName;
	//seqAcc 위에 존재
	
	//고정 입출금 여부
	private String fdwContent;
	private String seqFixedFluctuationPeriod;
	
	//가계부 카테고리 목록
	private String seqAccCategory;
	private String seqAccInfo;
	
	//가계부 카테고리
	private String acName;
	
	//(추가)
	//뉴스 카테고리 목록
	private String seqnews;
	
	//뉴스
	private String title;
	private String link;
	private String newsDate;
	private String media;
		
	
	//변동 사유 카테고리
	private String seqReasonsChangeList;
	private String seqMyCard;
	
	//카드 정보
	private String cfName;
	private String fileLink;
	
	//나의 카드
	private String alias;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAccInfoDate() {
		return accInfoDate;
	}

	public void setAccInfoDate(String accInfoDate) {
		this.accInfoDate = accInfoDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSeqAcc() {
		return seqAcc;
	}

	public void setSeqAcc(String seqAcc) {
		this.seqAcc = seqAcc;
	}

	public String getSeqReasonChangeCategory() {
		return seqReasonChangeCategory;
	}

	public void setSeqReasonChangeCategory(String seqReasonChangeCategory) {
		this.seqReasonChangeCategory = seqReasonChangeCategory;
	}

	public String getSeqFixedFluctuationCheck() {
		return seqFixedFluctuationCheck;
	}

	public void setSeqFixedFluctuationCheck(String seqFixedFluctuationCheck) {
		this.seqFixedFluctuationCheck = seqFixedFluctuationCheck;
	}

	public String getSeqDepositWithdrawalStatus() {
		return seqDepositWithdrawalStatus;
	}

	public void setSeqDepositWithdrawalStatus(String seqDepositWithdrawalStatus) {
		this.seqDepositWithdrawalStatus = seqDepositWithdrawalStatus;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getIdMember() {
		return idMember;
	}

	public void setIdMember(String idMember) {
		this.idMember = idMember;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getFdwContent() {
		return fdwContent;
	}

	public void setFdwContent(String fdwContent) {
		this.fdwContent = fdwContent;
	}

	public String getSeqFixedFluctuationPeriod() {
		return seqFixedFluctuationPeriod;
	}

	public void setSeqFixedFluctuationPeriod(String seqFixedFluctuationPeriod) {
		this.seqFixedFluctuationPeriod = seqFixedFluctuationPeriod;
	}

	public String getSeqAccCategory() {
		return seqAccCategory;
	}

	public void setSeqAccCategory(String seqAccCategory) {
		this.seqAccCategory = seqAccCategory;
	}

	public String getSeqAccInfo() {
		return seqAccInfo;
	}

	public void setSeqAccInfo(String seqAccInfo) {
		this.seqAccInfo = seqAccInfo;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public String getSeqnews() {
		return seqnews;
	}

	public void setSeqnews(String seqnews) {
		this.seqnews = seqnews;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getSeqReasonsChangeList() {
		return seqReasonsChangeList;
	}

	public void setSeqReasonsChangeList(String seqReasonsChangeList) {
		this.seqReasonsChangeList = seqReasonsChangeList;
	}

	public String getSeqMyCard() {
		return seqMyCard;
	}

	public void setSeqMyCard(String seqMyCard) {
		this.seqMyCard = seqMyCard;
	}

	public String getCfName() {
		return cfName;
	}

	public void setCfName(String cfName) {
		this.cfName = cfName;
	}

	public String getFileLink() {
		return fileLink;
	}

	public void setFileLink(String fileLink) {
		this.fileLink = fileLink;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public String toString() {
		return "AccountInfoDTO [content=" + content + ", accInfoDate=" + accInfoDate + ", price=" + price
				+ ", location=" + location + ", seqAcc=" + seqAcc + ", seqReasonChangeCategory="
				+ seqReasonChangeCategory + ", seqFixedFluctuationCheck=" + seqFixedFluctuationCheck
				+ ", seqDepositWithdrawalStatus=" + seqDepositWithdrawalStatus + ", totalPrice=" + totalPrice
				+ ", idMember=" + idMember + ", productName=" + productName + ", fdwContent=" + fdwContent
				+ ", seqFixedFluctuationPeriod=" + seqFixedFluctuationPeriod + ", seqAccCategory=" + seqAccCategory
				+ ", seqAccInfo=" + seqAccInfo + ", acName=" + acName + ", seqnews=" + seqnews + ", title=" + title
				+ ", link=" + link + ", newsDate=" + newsDate + ", media=" + media + ", seqReasonsChangeList="
				+ seqReasonsChangeList + ", seqMyCard=" + seqMyCard + ", cfName=" + cfName + ", fileLink=" + fileLink
				+ ", alias=" + alias + "]";
	}
	
}
