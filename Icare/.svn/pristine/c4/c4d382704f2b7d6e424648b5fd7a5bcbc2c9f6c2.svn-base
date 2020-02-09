package icare.dto;

import java.util.Date;

/**
 * 전자결재
 * @author YSB
 */

//ENO
//TITLE
//CONTENT
//FILENAME
//FILETYPE
//UPLOADPATH
//EXPIREDATE
//REGDATE
//UPDATEDATE
//STTS
//TEMP
//TID
//TID2
public class ApprovalVO {
	private int eno;			//문서번호
	private String title;		//제목
	private String content;		//내용
	private String filetype;		//분류
	private Date expiredate;	//보존년한
	private Date regdate;		//작성날짜
	private Date updatedate;	//수정날짜
	private String stts;		//상태(반려, 승인, 승인대기)
	private String temp;		//임시저장여부
	
	public ApprovalVO() {
		// TODO Auto-generated constructor stub
	}

	public ApprovalVO(int eno, String title, String content, String filetype, Date expiredate, Date regdate,
			Date updatedate, String stts, String temp) {
		super();
		this.eno = eno;
		this.title = title;
		this.content = content;
		this.filetype = filetype;
		this.expiredate = expiredate;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.stts = stts;
		this.temp = temp;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
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

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public Date getExpiredate() {
		return expiredate;
	}

	public void setExpiredate(Date expiredate) {
		this.expiredate = expiredate;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getStts() {
		return stts;
	}

	public void setStts(String stts) {
		this.stts = stts;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "ApprovalVO [eno=" + eno + ", title=" + title + ", content=" + content + ", filetype=" + filetype
				+ ", expiredate=" + expiredate + ", regdate=" + regdate + ", updatedate=" + updatedate + ", stts="
				+ stts + ", temp=" + temp + "]";
	}
}
