package icare.dto;

import java.util.Date;

/**
 * 주간수업계획안
 * @author LMY
 *
 */
public class WeeklyPlanVO extends ApprovalVO {
	private int eno;				//문서번호
	private Date weeklydate;		//날짜
	private String physical;		//신체운동
	private String commu;			//의사소통
	private String social;			//사회관계
	private String art;				//예술경험
	private String nature;			//자연탐구
	private String subject;			//주제
	
	public WeeklyPlanVO() {
	}

	public WeeklyPlanVO(int eno, Date weeklydate, String physical, String commu, String social, String art,
			String nature, String subject) {
		super();
		this.eno = eno;
		this.weeklydate = weeklydate;
		this.physical = physical;
		this.commu = commu;
		this.social = social;
		this.art = art;
		this.nature = nature;
		this.subject = subject;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public Date getWeeklydate() {
		return weeklydate;
	}

	public void setWeeklydate(Date weeklydate) {
		this.weeklydate = weeklydate;
	}

	public String getPhysical() {
		return physical;
	}

	public void setPhysical(String physical) {
		this.physical = physical;
	}

	public String getCommu() {
		return commu;
	}

	public void setCommu(String commu) {
		this.commu = commu;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "WeeklyPlanVO [eno=" + eno + ", weeklydate=" + weeklydate + ", physical=" + physical + ", commu=" + commu
				+ ", social=" + social + ", art=" + art + ", nature=" + nature + ", subject=" + subject + "]";
	}
	
}
