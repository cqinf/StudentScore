package com.stu.dao;

import java.util.List;

import com.stu.entity.Stu;

/**
 * 提供学生数据访问的接口
 * @author LARK
 *
 */

public interface IStuDao {

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
	 * @param hql 查询语句
	 * @return 学生信息集合
	 */
	public List<?> findStuList(String hql);
	
	/**
	 * 通过id获取学生信息
	 * @param sno 学生id
	 * @return 学生对象
	 */
	public Stu getStuById(int sno);
}
