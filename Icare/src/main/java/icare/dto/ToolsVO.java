package icare.dto;

/**
 * 교보재관리 
 * @author LHJ
 *
 */
public class ToolsVO {
	private int tsno; // 교보재번호
	private int qntty; // 수량
	private String name; // 교보재명
	private String gubun; // 구분
	private String cno; // 반번호(FK)

	public ToolsVO() {
	}

	public ToolsVO(int tsno, int qntty, String name, String gubun, String cno) {
		super();
		this.tsno = tsno;
		this.qntty = qntty;
		this.name = name;
		this.gubun = gubun;
		this.cno = cno;
	}

	public int getTsno() {
		return tsno;
	}

	public void setTsno(int tsno) {
		this.tsno = tsno;
	}

	public int getQntty() {
		return qntty;
	}

	public void setQntty(int qntty) {
		this.qntty = qntty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "ToolsVO [tsno=" + tsno + ", qntty=" + qntty + ", name=" + name + ", gubun=" + gubun + ", cno=" + cno
				+ "]";
	}
}
