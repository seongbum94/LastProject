package icare.dto;

import java.util.Date;

/**
 * 설문조사
 * @author LMY
 *
 */
public class SurveyVO {
	private String survno;	//설문번호
	private Date regdate;	//시작날짜
	private Date enddate;	//종료날짜
	private String kid;	//유치원번호
	
	public SurveyVO() {
	}

	public SurveyVO(String survno, Date regdate, Date enddate, String kid) {
		super();
		this.survno = survno;
		this.regdate = regdate;
		this.enddate = enddate;
		this.kid = kid;
	}

	public String getSurvno() {
		return survno;
	}

	public void setSurvno(String survno) {
		this.survno = survno;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	@Override
	public String toString() {
		return "SurveyVO [survno=" + survno + ", regdate=" + regdate + ", enddate=" + enddate + ", kid=" + kid + "]";
	}
	
}
