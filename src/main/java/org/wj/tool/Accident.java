package org.wj.tool;

import java.util.List;

public class Accident {
	private String accidentNo;
	private List<Regist> registList;
	private Check check;
	
	public Accident() {
		super();
	}
	
	public String getAccidentNo() {
		return accidentNo;
	}
	
	public void setAccidentNo(String accidentNo) {
		this.accidentNo = accidentNo;
	}
	
	public List<Regist> getRegistList() {
		return registList;
	}
	
	public void setRegistList(List<Regist> registList) {
		this.registList = registList;
	}
	
	public Check getCheck() {
		return check;
	}
	
	public void setCheck(Check check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "Accident [accidentNo=" + accidentNo + ", registList=" +registList + ", check=" + check + "]";
	}
	
}
