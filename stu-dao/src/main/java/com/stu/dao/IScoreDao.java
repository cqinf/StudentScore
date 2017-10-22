package com.stu.dao;

import java.util.List;

import com.stu.entity.Score;

/**
 * 提供学生成绩数据访问的接口
 * @author LARK
 *
 */

public interface IScoreDao {

	/**
	 * 添加分数信息
	 * @param score 分数对象
	 * @return true or false
	 */
	public boolean addScore(Score score);

	/**
	 * 修改分数信息
	 * @param score 分数对象
	 * @return true or false
	 */
	public boolean updateScore(Score score);

	/**
	 * 删除分数信息
	 * @param score 分数对象
	 * @return true or false
	 */
	public boolean deleteScore(Score score);
	
	/**
	 * 查询分数信息
	 * @param hql 查询语句
	 * @return 分数信息集合
	 */
	public List<?> findScoreList(String hql);
	
	/**
	 * 通过id获取成绩信息
	 * @param sno 成绩id
	 * @return 成绩对象
	 */
	public Score getScoreById(int sno);
}
