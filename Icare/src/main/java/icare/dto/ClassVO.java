package icare.dto;


/**
 * 반
 * @author a1938
 */
public class ClassVO {
	private String cno;		//반번호
	private String name;	//반이름
	private int total;		//정원
	
	public ClassVO() {}

	public ClassVO(String cno, String name, int total) {
		super();
		this.cno = cno;
		this.name = name;
		this.total = total;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ClassVO [cno=" + cno + ", name=" + name + ", total=" + total + "]";
	}

}
