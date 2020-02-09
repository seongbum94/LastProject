package icare.dto;

import java.util.Date;

/**
 * 알림장
 * @author LMY
 *
 */
public class HomeworkDiaryVO {
	private int hwno;	//알림장번호
	private String title;	//제목
	private String content;	//내용
	private Date regdate;	//작성일
	private int viewcnt;	//조회수
	private String cno;	//반번호
	
	public HomeworkDiaryVO() {
	}

	public HomeworkDiaryVO(int hwno, String title, String content, Date regdate, int viewcnt, String cno) {
		super();
		this.hwno = hwno;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
		this.cno = cno;
	}

	public int getHwno() {
		return hwno;
	}

	public void setHwno(int hwno) {
		this.hwno = hwno;
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

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "HomeworkDiaryVO [hwno=" + hwno + ", title=" + title + ", content=" + content + ", regdate=" + regdate
				+ ", viewcnt=" + viewcnt + ", cno=" + cno + "]";
	}

	
	
}
