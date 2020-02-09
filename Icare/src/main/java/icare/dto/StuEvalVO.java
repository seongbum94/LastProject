package icare.dto;

/**
 * 원생평가
 * @author a1938
 */
public class StuEvalVO {
	private int dno;		//평가번호
	private int phscore;    //신체운동
	private int coscore;    //의사소통
	private int soscore;    //사회관계
	private int arscore;    //예술경험
	private int nascore;    //자연탐구
	
	public StuEvalVO() {
	}

	public StuEvalVO(int dno, int phscore, int coscore, int soscore, int arscore, int nascore) {
		super();
		this.dno = dno;
		this.phscore = phscore;
		this.coscore = coscore;
		this.soscore = soscore;
		this.arscore = arscore;
		this.nascore = nascore;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public int getPhscore() {
		return phscore;
	}

	public void setPhscore(int phscore) {
		this.phscore = phscore;
	}

	public int getCoscore() {
		return coscore;
	}

	public void setCoscore(int coscore) {
		this.coscore = coscore;
	}

	public int getSoscore() {
		return soscore;
	}

	public void setSoscore(int soscore) {
		this.soscore = soscore;
	}

	public int getArscore() {
		return arscore;
	}

	public void setArscore(int arscore) {
		this.arscore = arscore;
	}

	public int getNascore() {
		return nascore;
	}

	public void setNascore(int nascore) {
		this.nascore = nascore;
	}

	@Override
	public String toString() {
		return "StuEvalVO [dno=" + dno + ", phscore=" + phscore + ", coscore=" + coscore + ", soscore=" + soscore
				+ ", arscore=" + arscore + ", nascore=" + nascore + "]";
	}
}
