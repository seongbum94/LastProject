package icare.dto;


/**
 * 관리자
 * @author YSB
 */
public class AdminVO {
	private String ano;		//관리자 번호
	private String name;	//이름
	private String phone;	//전화번호
	private String author;	//권한
	
	public AdminVO() {
	}
	
	public AdminVO(String ano, String name, String phone, String author) {
		super();
		this.ano = ano;
		this.name = name;
		this.phone = phone;
		this.author = author;
	}



	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "AdminVO [ano=" + ano + ", name=" + name + ", phone=" + phone + ", author=" + author + "]";
	}
	
}
