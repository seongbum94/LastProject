package icare.dto;


/**
 * 운전기사
 * @author YSB
 */
public class DriverVO {
	private int drno;			//기사번호
	private String name;        //이름
	private String gender;      //성별
	private int age;            //나이
	private String carrer;      //운전경력
	private String carno;       //차량번호
	private String kid;            //유치원번호
	
	public DriverVO() {
	}

	public DriverVO(int drno, String name, String gender, int age, String carrer, String carno, String kid) {
		super();
		this.drno = drno;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.carrer = carrer;
		this.carno = carno;
		this.kid = kid;
	}

	public int getDrno() {
		return drno;
	}

	public void setDrno(int drno) {
		this.drno = drno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCarrer() {
		return carrer;
	}

	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	@Override
	public String toString() {
		return "DriverVO [drno=" + drno + ", name=" + name + ", gender=" + gender + ", age=" + age + ", carrer="
				+ carrer + ", carno=" + carno + ", kid=" + kid + "]";
	}
	
}
