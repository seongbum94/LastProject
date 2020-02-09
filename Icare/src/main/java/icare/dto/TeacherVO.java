package icare.dto;

/**
 * 교사의 정보
 * @author PC-16
 *
 */
public class TeacherVO {
	private String tid;	//교번
	private String servstts;	//재직여부
	private String position;	//직무
	private String name;	//이름
	private String regno1;	//주민번호1
	private String regno2;	//주민번호2
	private String email;	//이메일
	private String addr1;	//주소
	private String addr2;	//상세주소
	private int zip;		//우편번호
	private String phone;	//전화번호
	private String uploadpath;	//사진경로
	private String imgtype;	//사진타입
	private String imgname;	//사진이름
	private String author;	//권한
	private String pwd;		//비밀번호
	private String kid;		//유치원번호
	private String cno;		//반번호
	
	public TeacherVO() {
		// TODO Auto-generated constructor stub
	}

	public TeacherVO(String tid, String servstts, String position, String name, String regno1, String regno2,
			String email, String addr1, String addr2, int zip, String phone, String uploadpath, String imgtype,
			String imgname, String author, String pwd, String kid, String cno) {
		super();
		this.tid = tid;
		this.servstts = servstts;
		this.position = position;
		this.name = name;
		this.regno1 = regno1;
		this.regno2 = regno2;
		this.email = email;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.zip = zip;
		this.phone = phone;
		this.uploadpath = uploadpath;
		this.imgtype = imgtype;
		this.imgname = imgname;
		this.author = author;
		this.pwd = pwd;
		this.kid = kid;
		this.cno = cno;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getServstts() {
		return servstts;
	}

	public void setServstts(String servstts) {
		this.servstts = servstts;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUploadpath() {
		return uploadpath;
	}

	public void setUploadpath(String uploadpath) {
		this.uploadpath = uploadpath;
	}

	public String getImgtype() {
		return imgtype;
	}

	public void setImgtype(String imgtype) {
		this.imgtype = imgtype;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "TeacherVO [tid=" + tid + ", servstts=" + servstts + ", position=" + position + ", name=" + name
				+ ", regno1=" + regno1 + ", regno2=" + regno2 + ", email=" + email + ", addr1=" + addr1 + ", addr2="
				+ addr2 + ", zip=" + zip + ", phone=" + phone + ", uploadpath=" + uploadpath + ", imgtype=" + imgtype
				+ ", imgname=" + imgname + ", author=" + author + ", pwd=" + pwd + ", kid=" + kid + ", cno=" + cno
				+ "]";
	}
}
