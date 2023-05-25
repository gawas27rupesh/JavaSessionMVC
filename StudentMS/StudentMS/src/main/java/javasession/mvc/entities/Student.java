package javasession.mvc.entities;

public class Student {

	private Integer sid;
	private String sname;
	private String saddress;
	private String sbranch;
	private String semail;
	private String smobile;
	
	
	
	public Student(Integer sid, String sname, String saddress, String sbranch, String semail, String smobile) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.sbranch = sbranch;
		this.semail = semail;
		this.smobile = smobile;
	}
	
	public Student(String sname, String saddress, String sbranch, String semail, String smobile) {
		super();
		this.sname = sname;
		this.saddress = saddress;
		this.sbranch = sbranch;
		this.semail = semail;
		this.smobile = smobile;
	}



	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSmobile() {
		return smobile;
	}
	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sbranch=" + sbranch
				+ ", semail=" + semail + ", smobile=" + smobile + "]";
	} 
	
	
}
