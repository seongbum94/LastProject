package icare.dto;

/**
 * 성범죄자 알림e
 * @author LMY
 *
 */
public class SexOffenderVO {
	private int sono;	//범죄자번호
	private String addr;	//주소
	private String kid;	//유치원번호
	
	public SexOffenderVO() {
	}

	public SexOffenderVO(int sono, String addr, String kid) {
		super();
		this.sono = sono;
		this.addr = addr;
		this.kid = kid;
	}

	public int getSono() {
		return sono;
	}

	public void setSono(int sono) {
		this.sono = sono;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	@Override
	public String toString() {
		return "SexOffenderVO [sono=" + sono + ", addr=" + addr + ", kid=" + kid + "]";
	}
	
}
