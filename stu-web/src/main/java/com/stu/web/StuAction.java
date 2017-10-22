package com.stu.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.stu.entity.Stu;
import com.stu.service.IStuService;

@Controller("stuAction")
@Scope("prototype")
public class StuAction {

	private Stu stu;
	
	private int message;
	
	@Resource(name = "stuService")
	private IStuService stuService;
	
	/**
	 * 添加学生
	 * @return
	 */
	public String addStu() {
		if(stuService.addStu(stu)) {
			message = 1;
		}else {
			message = -1;
		}
		return "endAdd";
	}
	
	/**
	 * 通过学生id获取学生信息
	 * @return
	 */
	public String getStuById() {
		stu = stuService.getStuById(stu.getSno());
		return "anStu";
	}
	
	/**
	 * 修改学生
	 * @return
	 */
	public String updateStu() {
		if(stuService.updateStu(stu)) {
			message = 2;
		}else {
			message = -1;
		}
		return "success";
	}
	
	/**
	 * 删除学生
	 * @return
	 */
	public String deleteStu() {
		if(stuService.deleteStu(stu)) {
			message = 3;
		}else {
			message = -1;
		}
		return "success";
	}
	
	/**
	 * 查询学生信息
	 * @return
	 */
	public String findStuList() {
		ActionContext.getContext().put("sList", stuService.findStuList());
		return "showStu";
	}

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public void setStuService(IStuService stuService) {
		this.stuService = stuService;
	}
}
