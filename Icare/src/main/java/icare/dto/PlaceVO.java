package icare.dto;

import java.util.Date;

/**
 * 등하원버스 원생 승/하차 장소
 * @author LMY
 *
 */
public class PlaceVO {
	private int place;	//장소
	private Date datetime;	//일시
	private String sno;	//원생번호
	private int courseno;	//코스번호
	
	public PlaceVO() {
	}

	public PlaceVO(int place, Date datetime, String sno, int courseno) {
		super();
		this.place = place;
		this.datetime = datetime;
		this.sno = sno;
		this.courseno = courseno;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public int getCourseno() {
		return courseno;
	}

	public void setCourseno(int courseno) {
		this.courseno = courseno;
	}

	@Override
	public String toString() {
		return "PlaceVO [place=" + place + ", datetime=" + datetime + ", sno=" + sno + ", courseno=" + courseno + "]";
	}
}
