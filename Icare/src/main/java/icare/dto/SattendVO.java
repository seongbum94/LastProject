package icare.dto;

import java.util.Date;

/**
 * 원생 출결관리
 * @author LMY
 *
 */
public class SattendVO {
	private String sno;	//원생번호
	private Date sadate;	//날짜
	private String attn;	//출결
	private String reason;	//사유
	
	public SattendVO() {}

	public SattendVO(String sno, Date sadate, String attn, String reason) {
		super();
		this.sno = sno;
		this.sadate = sadate;
		this.attn = attn;
		this.reason = reason;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public Date getSadate() {
		return sadate;
	}

	public void setSadate(Date sadate) {
		this.sadate = sadate;
	}

	public String getAttn() {
		return attn;
	}

	public void setAttn(String attn) {
		this.attn = attn;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "SattendVO [sno=" + sno + ", sadate=" + sadate + ", attn=" + attn + ", reason=" + reason + "]";
	}

	
	
}
