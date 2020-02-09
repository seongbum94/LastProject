package icare.dto;

import java.util.Date;

//근태관리
public class WorkingVO {
	private Date wdate;		//날짜
	private int tid;		//교번
	private Date atttime;	//출근시간
	private Date levtime;	//퇴근시간
	
	public WorkingVO() {
	}

	public WorkingVO(Date wdate, int tid, Date atttime, Date levtime) {
		super();
		this.wdate = wdate;
		this.tid = tid;
		this.atttime = atttime;
		this.levtime = levtime;
	}

	public Date getWdate() {
		return wdate;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public Date getAtttime() {
		return atttime;
	}

	public void setAtttime(Date atttime) {
		this.atttime = atttime;
	}

	public Date getLevtime() {
		return levtime;
	}

	public void setLevtime(Date levtime) {
		this.levtime = levtime;
	}

	@Override
	public String toString() {
		return "WorkingVO [wdate=" + wdate + ", tid=" + tid + ", atttime=" + atttime + ", levtime=" + levtime + "]";
	}
	
}
