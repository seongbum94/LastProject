package icare.dto;

import java.util.Date;

/**
 * 게시판 
 * @author YSB
 */
public class BoardVO {
	private int bno;			//글번호
	private String title;       //제목
	private String content;       //내용
	private Date regdate;       //작성일
	private Date updatedate;    //수정일
	private int viewcnt;        //조회수
	private String gubun;       //구분
	private String pid;         //학부모아이디
	private String tid;            //교번
	private String ano;            //관리자번호
	
	public BoardVO() {
	}

	public BoardVO(int bno, String title, String content, Date regdate, Date updatedate, int viewcnt, String gubun,
			String pid, String tid, String ano) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.viewcnt = viewcnt;
		this.gubun = gubun;
		this.pid = pid;
		this.tid = tid;
		this.ano = ano;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
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

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", regdate=" + regdate
				+ ", updatedate=" + updatedate + ", viewcnt=" + viewcnt + ", gubun=" + gubun + ", pid=" + pid + ", tid="
				+ tid + ", ano=" + ano + "]";
	}
	
}
