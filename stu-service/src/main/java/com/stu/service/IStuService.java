package com.stu.service;

import java.util.List;

import com.stu.entity.Stu;

public interface IStuService {

	/**
	 * 添加学生
	 * @param stu 学生对象
	 * @return true or false
	 */
	public boolean addStu(Stu stu);

	/**
	 * 修改学生
	 * @param stu 学生对象
	 * @return true or false
	 */
	public boolean updateStu(Stu stu);

	/**
	 * 删除学生
	 * @param stu 学生对象
	 * @return true or false
	 */
	public boolean deleteStu(Stu stu);
	
	/**
	 * 查询学生信息
	 * @return 学生信息列表
	 */
	public List<?> findStuList();
	
	/**
	 * 通过id获取学生信息
	 * @param sno 学生id
	 * @return 学生对象
	 */
	public Stu getStuById(int sno);
}
