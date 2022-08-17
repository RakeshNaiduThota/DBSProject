package com.project.models;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="receiver")
public class Receiver {

	private Long bic;
	private String InsName;
	
	
	public Receiver() {}
	public Receiver(Long bic, String insName) {
		super();
		this.bic = bic;
		InsName = insName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getBic() {
		return bic;
	}
	public void setBic(Long bic) {
		this.bic = bic;
	}
	public String getInsName() {
		return InsName;
	}
	public void setInsName(String insName) {
		InsName = insName;
	}
	
	
}
