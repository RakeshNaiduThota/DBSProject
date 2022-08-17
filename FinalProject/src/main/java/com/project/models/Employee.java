package com.project.models;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
	private long eid;
	
	
	public Employee() {}
	public Employee(long eid, String euname, String epcode) {
		this.eid = eid;
		this.euname = euname;
		this.epcode = epcode;
	}
	private String euname;
	private String epcode;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEuname() {
		return euname;
	}
	public void setEuname(String euname) {
		this.euname = euname;
	}
	public String getEpcode() {
		return epcode;
	}
	public void setEpcode(String epcode) {
		this.epcode = epcode;
	}
	
	
}
