package org.wj.tool;

public class Regist {
	private String registNo;
	private String policyNo;
	private String damageDate;
	private String damageAddress;
	private String nodeStatus;
	private String selfHelpClaimFlag;
	private String deptCode;
	private String deptName;
	private String textTemp;
	private String level3DeptCode;
	private String level3DeptName;
	private String reportorName;
	private String reportorMobileNumber;
	private String manageType;
	private String claimFlag;
	private String tpFlag;
	public String getRegistNo() {
		return registNo;
	}
	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getDamageDate() {
		return damageDate;
	}
	public void setDamageDate(String damageDate) {
		this.damageDate = damageDate;
	}
	public String getDamageAddress() {
		return damageAddress;
	}
	public void setDamageAddress(String damageAddress) {
		this.damageAddress = damageAddress;
	}
	public String getNodeStatus() {
		return nodeStatus;
	}
	public void setNodeStatus(String nodeStatus) {
		this.nodeStatus = nodeStatus;
	}
	public String getSelfHelpClaimFlag() {
		return selfHelpClaimFlag;
	}
	public void setSelfHelpClaimFlag(String selfHelpClaimFlag) {
		this.selfHelpClaimFlag = selfHelpClaimFlag;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getTextTemp() {
		return textTemp;
	}
	public void setTextTemp(String textTemp) {
		this.textTemp = textTemp;
	}
	public String getLevel3DeptCode() {
		return level3DeptCode;
	}
	public void setLevel3DeptCode(String level3DeptCode) {
		this.level3DeptCode = level3DeptCode;
	}
	public String getLevel3DeptName() {
		return level3DeptName;
	}
	public void setLevel3DeptName(String level3DeptName) {
		this.level3DeptName = level3DeptName;
	}
	public String getReportorName() {
		return reportorName;
	}
	public void setReportorName(String reportorName) {
		this.reportorName = reportorName;
	}
	public String getReportorMobileNumber() {
		return reportorMobileNumber;
	}
	public void setReportorMobileNumber(String reportorMobileNumber) {
		this.reportorMobileNumber = reportorMobileNumber;
	}
	public String getManageType() {
		return manageType;
	}
	public void setManageType(String manageType) {
		this.manageType = manageType;
	}
	public String getClaimFlag() {
		return claimFlag;
	}
	public void setClaimFlag(String claimFlag) {
		this.claimFlag = claimFlag;
	}
	public String getTpFlag() {
		return tpFlag;
	}
	public void setTpFlag(String tpFlag) {
		this.tpFlag = tpFlag;
	}
	public Regist() {
		super();
	}
	@Override
	public String toString() {
		return "Regist [registNo=" + registNo + ", policyNo=" + policyNo + ", damageDate=" + damageDate
				+ ", damageAddress=" + damageAddress + ", nodeStatus=" + nodeStatus + ", selfHelpClaimFlag="
				+ selfHelpClaimFlag + ", deptCode=" + deptCode + ", deptName=" + deptName + ", textTemp=" + textTemp
				+ ", level3DeptCode=" + level3DeptCode + ", level3DeptName=" + level3DeptName + ", reportorName="
				+ reportorName + ", reportorMobileNumber=" + reportorMobileNumber + ", manageType=" + manageType
				+ ", claimFlag=" + claimFlag + ", tpFlag=" + tpFlag + "]";
	}
	
}
