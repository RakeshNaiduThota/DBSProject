package com.project.models;

import javax.persistence.*;

@Entity
@Table(name="bic")
public class BIC {
	private String bic;
	private String ins_name;
	
	public BIC() {}
	
	public BIC(String bic, String ins_name) {
		super();
		this.bic = bic;
		this.ins_name = ins_name;
	}
	@Id
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getIns_name() {
		return ins_name;
	}
	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}
	
}
