package icare.commons;

public class Criteria {
	
	private int page; // 페이지 번호
	private int perPageNum; // 한페이지당 리스트개수
	private String searchType; // 검색구분
	private String keyword; //검색어
	private String gubun;
	
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
		this.searchType="";
		this.keyword="";
		this.gubun="";
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public int getPageStartRowNum(){ //각 페이지마다 시작하는 행번호
		return (this.page-1)*perPageNum;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum
				+ ", searchType=" + searchType + ", keyword=" + keyword
				+ ", gubun=" + gubun + "]";
	}

	
	
	
}
