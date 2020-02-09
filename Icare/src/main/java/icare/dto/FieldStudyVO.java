package icare.dto;

import java.util.Date;

/**
 * 체험학습신청서
 * @author YSB
 */
public class FieldStudyVO {
	private int fno;			//체험학습신청서번호
	private Date fdate;		    //체험학습일자
	private String dest;		//장소
	private String purpose;		//목적
	private String transport;	//교통수단
	private String cno;			//반번호
	private int eno;			//문서번호
	
	public FieldStudyVO() {
	}

	public FieldStudyVO(int fno, Date fdate, String dest, String purpose, String transport, String cno, int eno) {
		super();
		this.fno = fno;
		this.fdate = fdate;
		this.dest = dest;
		this.purpose = purpose;
		this.transport = transport;
		this.cno = cno;
		this.eno = eno;
	}

	public int getFno() {
		return fno;
	}

	public void setFno(int fno) {
		this.fno = fno;
	}

	public Date getFdate() {
		return fdate;
	}

	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "FieldStudyVO [fno=" + fno + ", fdate=" + fdate + ", dest=" + dest + ", purpose=" + purpose
				+ ", transport=" + transport + ", cno=" + cno + ", eno=" + eno + "]";
	}
}
