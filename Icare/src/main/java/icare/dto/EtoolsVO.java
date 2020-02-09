package icare.dto;


/**
 * 교재교구개발안
 * @author YSB
 */
public class EtoolsVO extends ApprovalVO {
	private int eno;			//문서번호
	private String subject;     //주제
	private String goal;        //목표
	private int targetage;      //대상연령
	private String studyarea;   //활동영역
	private int numstu;         //활동인원
	private String method;      //제작방법
	
	public EtoolsVO() {
	}

	public EtoolsVO(int eno, String subject, String goal, int targetage, String studyarea, int numstu, String method) {
		super();
		this.eno = eno;
		this.subject = subject;
		this.goal = goal;
		this.targetage = targetage;
		this.studyarea = studyarea;
		this.numstu = numstu;
		this.method = method;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public int getTargetage() {
		return targetage;
	}

	public void setTargetage(int targetage) {
		this.targetage = targetage;
	}

	public String getStudyarea() {
		return studyarea;
	}

	public void setStudyarea(String studyarea) {
		this.studyarea = studyarea;
	}

	public int getNumstu() {
		return numstu;
	}

	public void setNumstu(int numstu) {
		this.numstu = numstu;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@Override
	public String toString() {
		return "EtoolsVO [eno=" + eno + ", subject=" + subject + ", goal=" + goal + ", targetage=" + targetage
				+ ", studyarea=" + studyarea + ", numstu=" + numstu + ", method=" + method + "]";
	}
}
