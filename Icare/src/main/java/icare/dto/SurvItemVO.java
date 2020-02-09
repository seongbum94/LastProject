package icare.dto;

/**
 * 설문조사 항목
 * @author LMY
 *
 */
public class SurvItemVO {
	private int ino;
	private String content;
	private int score;
	private int survno;
	
	public SurvItemVO() {
	}

	public SurvItemVO(int ino, String content, int score, int survno) {
		super();
		this.ino = ino;
		this.content = content;
		this.score = score;
		this.survno = survno;
	}

	public int getIno() {
		return ino;
	}

	public void setIno(int ino) {
		this.ino = ino;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSurvno() {
		return survno;
	}

	public void setSurvno(int survno) {
		this.survno = survno;
	}

	@Override
	public String toString() {
		return "SurvItemVO [ino=" + ino + ", content=" + content + ", score=" + score + ", survno=" + survno + "]";
	}
	
}
