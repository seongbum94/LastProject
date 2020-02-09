package icare.employManage.controller;

import icare.dto.TeacherVO;

/**
 * 교사 등록 Command객체
 * @author YSB
 */
public class EmployCommand {
	private String tid;	//교번
	private String name;	//이름
	private String regno1;	//주민번호1
	private String regno2;	//주민번호2
	private String email;	//이메일
	private String addr1;	//주소
	private String addr2;	//상세주소
	private int zip;		//우편번호
	private String phone1;	//전화번호1
	private String phone2;	//전화번호2
	private String phone3;	//전화번호3
	private String pwd;		//비밀번호
	private String cno;		//반번호
	
	public EmployCommand() {
	}
	
	public EmployCommand(String tid, String name, String regno1, String regno2, String email, String addr1,
			String addr2, int zip, String phone1, String phone2, String phone3, String pwd, String cno) {
		super();
		this.tid = tid;
		this.name = name;
		this.regno1 = regno1;
		this.regno2 = regno2;
		this.email = email;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.zip = zip;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.pwd = pwd;
		this.cno = cno;
	}

	
//	로그인시 구현
//	private String kid;		//유치원번호
	
	
//	private String uploadpath;	//사진경로
//	private String imgtype;	//사진타입
//	private String imgname;	//사진이름
	
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegno1() {
		return regno1;
	}

	public void setRegno1(String regno1) {
		this.regno1 = regno1;
	}

	public String getRegno2() {
		return regno2;
	}

	public void setRegno2(String regno2) {
		this.regno2 = regno2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}
	
	@Override
	public String toString() {
		return "EmployCommand [tid=" + tid + ", name=" + name + ", regno1=" + regno1 + ", regno2=" + regno2 + ", email="
				+ email + ", addr1=" + addr1 + ", addr2=" + addr2 + ", zip=" + zip + ", phone1=" + phone1 + ", phone2="
				+ phone2 + ", phone3=" + phone3 + ", pwd=" + pwd + ", cno=" + cno + "]";
	}

	public TeacherVO toTeacherVO() {
		TeacherVO teacher = new TeacherVO();
		teacher.setTid(this.tid);
		teacher.setAddr1(this.addr1);
		teacher.setAddr2(this.addr2);
		teacher.setEmail(this.email);
		teacher.setPwd(this.pwd);
		teacher.setRegno1(this.regno1);
		teacher.setRegno2(this.regno2);
		teacher.setZip(this.zip);
		teacher.setName(this.name);
		teacher.setPhone(this.phone1 + "-" + this.phone2 + "-" + this.phone3);
		teacher.setCno(this.cno);
		
//		teacher.setKid(this.kid);
		
		return teacher;
	}
}

