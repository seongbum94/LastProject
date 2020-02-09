package icare.dto;
/**
 * 갤러리용 첨부사진VO
 * @author LMY
 *
 */
public class PattachVO {
	private int pano;	//첨부사진번호
	private int pno;	//갤러리글번호
	private String uploadpath;	//업로드경로
	private String imgname;	//사진이름
	private String imgtype;	//사진타입
	
	public PattachVO() {
		// TODO Auto-generated constructor stub
	}

	public PattachVO(int pano, int pno, String uploadpath, String imgname, String imgtype) {
		super();
		this.pano = pano;
		this.pno = pno;
		this.uploadpath = uploadpath;
		this.imgname = imgname;
		this.imgtype = imgtype;
	}

	public int getPano() {
		return pano;
	}

	public void setPano(int pano) {
		this.pano = pano;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getUploadpath() {
		return uploadpath;
	}

	public void setUploadpath(String uploadpath) {
		this.uploadpath = uploadpath;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}

	public String getImgtype() {
		return imgtype;
	}

	public void setImgtype(String imgtype) {
		this.imgtype = imgtype;
	}

	@Override
	public String toString() {
		return "PattachVO [pano=" + pano + ", pno=" + pno + ", uploadpath=" + uploadpath + ", imgname=" + imgname
				+ ", imgtype=" + imgtype + "]";
	}
}
