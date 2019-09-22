package com.site.code.vo;

public class CodeVo {

	private int CDNM;
	private String CDNAME;
	private Character UseFL;
	private String PCNAME;
	private int Depth;
	public int getCDNM() {
		return CDNM;
	}
	public void setCDNM(int cDNM) {
		CDNM = cDNM;
	}
	public String getCDNAME() {
		return CDNAME;
	}
	public void setCDNAME(String cDNAME) {
		CDNAME = cDNAME;
	}
	public Character getUseFL() {
		return UseFL;
	}
	public void setUseFL(Character useFL) {
		UseFL = useFL;
	}
	public String getPCNAME() {
		return PCNAME;
	}
	public void setPCNAME(String pCNAME) {
		PCNAME = pCNAME;
	}
	public int getDepth() {
		return Depth;
	}
	public void setDepth(int depth) {
		Depth = depth;
	}
	
	@Override
	public String toString() {
		return "CodeVo [CDNM=" + CDNM + ", CDNAME=" + CDNAME + ", UseFL=" + UseFL + ", PCNAME=" + PCNAME + ", Depth="
				+ Depth + "]";
	}
	
	
	
}
