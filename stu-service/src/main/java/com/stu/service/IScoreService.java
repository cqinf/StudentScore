package com.stu.service;

import java.util.List;

import com.stu.entity.Score;

public interface IScoreService {

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
	 * 查询分数信息列表
	 * @return 分数信息列表
	 */
	public List<Score> findScoreList();
	
	/**
	 * 通过id获取分数信息
	 * @param sno 分数id
	 * @return 分数对象
	 */
	public Score getScoreById(int sno);
}
