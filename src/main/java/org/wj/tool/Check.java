package org.wj.tool;

public class Check {
	private String checkCode;
	private String checkName;
	private String comCode;
	private String comName;
	private String checkType;
	private String firstSiteFlag;
	private String checkMobile;
	public String getCheckCode() {
		return checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	public String getCheckName() {
		return checkName;
	}
	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}
	public String getComCode() {
		return comCode;
	}
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getCheckType() {
		return checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}
	public String getFirstSiteFlag() {
		return firstSiteFlag;
	}
	public void setFirstSiteFlag(String firstSiteFlag) {
		this.firstSiteFlag = firstSiteFlag;
	}
	public String getCheckMobile() {
		return checkMobile;
	}
	public void setCheckMobile(String checkMobile) {
		this.checkMobile = checkMobile;
	}
	public Check() {
		super();
	}
	@Override
	public String toString() {
		return "Check [checkCode=" + checkCode + ", checkName=" + checkName + ", comCode=" + comCode + ", comName="
				+ comName + ", checkType=" + checkType + ", firstSiteFlag=" + firstSiteFlag + ", checkMobile="
				+ checkMobile + "]";
	}
	
	
	
}
