package icare.dto;


/**
 * 전자결재 첨부파일
 * @author YSB
 */
public class AAttachVO {
	private int ano;			//첨부파일번호
	private String eno;			//문서번호
	private String uploadpath;	//업로드경로
	private String filename;	//파일이름
	private String filetype;	//파일타입
	
	public AAttachVO() {
	}

	public AAttachVO(int ano, String eno, String uploadpath, String filename, String filetype) {
		super();
		this.ano = ano;
		this.eno = eno;
		this.uploadpath = uploadpath;
		this.filename = filename;
		this.filetype = filetype;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
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

	@Override
	public String toString() {
		return "AAttachVO [ano=" + ano + ", eno=" + eno + ", uploadpath=" + uploadpath + ", filename=" + filename
				+ ", filetype=" + filetype + "]";
	}
	
}

