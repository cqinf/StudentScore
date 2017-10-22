package com.stu.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.stu.entity.Score;
import com.stu.service.IScoreService;
import com.stu.service.IStuService;

@Controller("scoreAction")
@Scope("prototype")
public class ScoreAction {

	private Score score;
	
	private List<?> sList;
	
	private int message;

	@Resource(name = "scoreService")
	private IScoreService scoreService;
	
	@Resource(name = "stuService")
	private IStuService stuService;

	/**
	 * 查询学生信息
	 * @return
	 */
	public String findStuList() {
		ActionContext.getContext().put("sList", stuService.findStuList());
		return "beginAdd";
	}
	
	/**
	 * 添加成绩
	 * @return
	 */
	public String addScore() {
		if(scoreService.addScore(score)) {
			message = 1;
		}else {
			message = -1;
		}
		return "endAdd";
	}
	
	/**
	 * 查询所有成绩信息
	 * @return
	 */
	public String findScoreList() {
		sList =  scoreService.findScoreList();
		return "showScore";
	}
	
	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public List<?> getsList() {
		return sList;
	}

	public void setsList(List<?> sList) {
		this.sList = sList;
	}

	public void setScoreService(IScoreService scoreService) {
		this.scoreService = scoreService;
	}

	public void setStuService(IStuService stuService) {
		this.stuService = stuService;
	}
}
