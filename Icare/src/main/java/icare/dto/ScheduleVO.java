package icare.dto;

import java.util.Date;

/**
 * 유치원 전체일정
 * @author LMY
 *
 */
public class ScheduleVO {
	private int no;		//일정번호
	private Date startdate;	//시작날짜
	private Date enddate;		//종료날짜
	private String title;		//제목
	private String content;		//내용
	private String kid;		//유치원번호

	public ScheduleVO() {
	}

	public ScheduleVO(int no, Date startdate, Date enddate, String title, String content, String kid) {
		super();
		this.no = no;
		this.startdate = startdate;
		this.enddate = enddate;
		this.title = title;
		this.content = content;
		this.kid = kid;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
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

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	@Override
	public String toString() {
		return "ScheduleVO [no=" + no + ", startdate=" + startdate + ", enddate=" + enddate + ", title=" + title
				+ ", content=" + content + ", kid=" + kid + "]";
	}
	
}
