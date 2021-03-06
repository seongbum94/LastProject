package icare.dto;

import java.util.Date;

/**
 * 댓글
 * @author LMY
 *
 */
public class ReplyVO {
	private int rno;	//댓글번호
	private int bno;	//글번호
	private String content;	//내용
	private Date regdate;	//등록일
	private Date updatedate;	//수정일
	private String tid;	//교번
	private String pid;	//학부모아이디
	private String ano;	//관리자번호
	
	public ReplyVO() {
	}

	public ReplyVO(int rno, int bno, String content, Date regdate, Date updatedate, String tid, String pid,
			String ano) {
		super();
		this.rno = rno;
		this.bno = bno;
		this.content = content;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.tid = tid;
		this.pid = pid;
		this.ano = ano;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
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

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", bno=" + bno + ", content=" + content + ", regdate=" + regdate
				+ ", updatedate=" + updatedate + ", tid=" + tid + ", pid=" + pid + ", ano=" + ano + "]";
	}
}
