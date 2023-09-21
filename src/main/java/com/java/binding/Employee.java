package com.java.binding;

 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
 
  
@Entity
public class Employee {
	
	 
	@Id
	private Integer eid;
	private String ename;
	private String eadd;
	private Double esal;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	public Employee(Integer eid, String ename, String eadd, Double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eadd = eadd;
		this.esal = esal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eadd=" + eadd + ", esal=" + esal + "]";
	}
	
	

}
