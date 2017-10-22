package com.stu.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.struts2.json.annotations.JSON;

@Entity
@Table(name = "score")
public class Score implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int sno;
	private int sfrequency; //次数
	private double schinese; //语文
	private double smathematics; //数学
	private double senglish; //英语
	private double sphysics; //物理
	private double schemistry; //化学
	private double sbiology; //生物
	private double sgeography; //地理
	private double spolitics; //政治
	private double shistory; //历史
	
	private Stu stu;
	
	public Score() {
		super();
	}
	public Score(int sno, int sfrequency, double schinese, double smathematics, double senglish, double sphysics,
			double schemistry, double sbiology, double sgeography, double spolitics, double shistory) {
		super();
		this.sno = sno;
		this.sfrequency = sfrequency;
		this.schinese = schinese;
		this.smathematics = smathematics;
		this.senglish = senglish;
		this.sphysics = sphysics;
		this.schemistry = schemistry;
		this.sbiology = sbiology;
		this.sgeography = sgeography;
		this.spolitics = spolitics;
		this.shistory = shistory;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getSfrequency() {
		return sfrequency;
	}
	public void setSfrequency(int sfrequency) {
		this.sfrequency = sfrequency;
	}
	public double getSchinese() {
		return schinese;
	}
	public void setSchinese(double schinese) {
		this.schinese = schinese;
	}
	public double getSmathematics() {
		return smathematics;
	}
	public void setSmathematics(double smathematics) {
		this.smathematics = smathematics;
	}
	public double getSenglish() {
		return senglish;
	}
	public void setSenglish(double senglish) {
		this.senglish = senglish;
	}
	public double getSphysics() {
		return sphysics;
	}
	public void setSphysics(double sphysics) {
		this.sphysics = sphysics;
	}
	public double getSchemistry() {
		return schemistry;
	}
	public void setSchemistry(double schemistry) {
		this.schemistry = schemistry;
	}
	public double getSbiology() {
		return sbiology;
	}
	public void setSbiology(double sbiology) {
		this.sbiology = sbiology;
	}
	public double getSgeography() {
		return sgeography;
	}
	public void setSgeography(double sgeography) {
		this.sgeography = sgeography;
	}
	public double getSpolitics() {
		return spolitics;
	}
	public void setSpolitics(double spolitics) {
		this.spolitics = spolitics;
	}
	public double getShistory() {
		return shistory;
	}
	public void setShistory(double shistory) {
		this.shistory = shistory;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stu")
	@JSON(serialize = false)
	public Stu getStu() {
		return stu;
	}
	public void setStu(Stu stu) {
		this.stu = stu;
	}
}
