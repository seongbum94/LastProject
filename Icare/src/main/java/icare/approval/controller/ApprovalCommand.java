package icare.approval.controller;

import icare.commons.Criteria;

public class ApprovalCommand extends Criteria {

	private String tid;

	public ApprovalCommand() {}
	
	public ApprovalCommand(String tid) {
		super();
		this.tid = tid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	public Criteria getCriteria() {
		Criteria cri = new Criteria();
		cri.setPage(this.getPage());
		cri.setPerPageNum(this.getPageStartRowNum());
		cri.setSearchType(this.getSearchType());
		cri.setKeyword(this.getKeyword());
		
		return cri;
	}

	@Override
	public String toString() {
		return super.toString() + "ApprovalCommand [tid=" + tid + "]";
	}
	
	
	
}
