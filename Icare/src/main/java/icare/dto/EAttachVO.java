package icare.dto;


/**
 * 이메일 첨부파일
 * @author YSB
 */
public class EAttachVO {
	private int eano;				//첨부파일번호
	private String uploadpath;      //업로드경로
	private String filename;        //파일이름
	private String filetype;        //파일타입
	private int eno;				//메일번호
	
	public EAttachVO() {
	}

	public EAttachVO(int eano, String uploadpath, String filename, String filetype, int eno) {
		super();
		this.eano = eano;
		this.uploadpath = uploadpath;
		this.filename = filename;
		this.filetype = filetype;
		this.eno = eno;
	}

	public int getEano() {
		return eano;
	}

	public void setEano(int eano) {
		this.eano = eano;
	}

	public String getUploadpath() {
		return uploadpath;
	}

	public void setUploadpath(String uploadpath) {
		this.uploadpath = uploadpath;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "EAttachVO [eano=" + eano + ", uploadpath=" + uploadpath + ", filename=" + filename + ", filetype="
				+ filetype + ", eno=" + eno + "]";
	}
}
