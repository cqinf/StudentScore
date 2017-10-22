package com.stu.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stu")
public class Stu {

	private int sno;
	private String sname;
	private int sage;
	private int ssex;
	
	public Stu() {
		super();
	}

	public Stu(int sno, String sname, int sage, int ssex) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.ssex = ssex;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public int getSsex() {
		return ssex;
	}

	public void setSsex(int ssex) {
		this.ssex = ssex;
	}
}
