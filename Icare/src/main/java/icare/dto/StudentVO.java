package icare.dto;

/**
 * 원생 
 * @author LMY
 *
 */
public class StudentVO {
	private String sno;		//원생번호
	private String name;	//이름
	private String blood_type;	//혈액형
	private String stts;	//상태
	private String uploadpath;	//사진경로
	private String imgtype;	//사진타입
	private String imgname;	//사진이름
	private String regno1;	//주민번호1
	private String regno2;	//주민번호2
	private String cno;	//반번호
	private String pid;	//학부모아이디
	private int nno;	//입소신청번호

	public StudentVO() {
	}

	public StudentVO(String sno, String name, String blood_type, String stts, String uploadpath, String imgtype,
			String imgname, String regno1, String regno2, String cno, String pid, int nno) {
		super();
		this.sno = sno;
		this.name = name;
		this.blood_type = blood_type;
		this.stts = stts;
		this.uploadpath = uploadpath;
		this.imgtype = imgtype;
		this.imgname = imgname;
		this.regno1 = regno1;
		this.regno2 = regno2;
		this.cno = cno;
		this.pid = pid;
		this.nno = nno;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlood_type() {
		return blood_type;
	}

	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}

	public String getStts() {
		return stts;
	}

	public void setStts(String stts) {
		this.stts = stts;
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

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getNno() {
		return nno;
	}

	public void setNno(int nno) {
		this.nno = nno;
	}

	@Override
	public String toString() {
		return "StudentVO [sno=" + sno + ", name=" + name + ", blood_type=" + blood_type + ", stts=" + stts
				+ ", uploadpath=" + uploadpath + ", imgtype=" + imgtype + ", imgname=" + imgname + ", regno1=" + regno1
				+ ", regno2=" + regno2 + ", cno=" + cno + ", pid=" + pid + ", nno=" + nno + "]";
	}
}
