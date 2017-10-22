package com.stu.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stu.dao.IScoreDao;
import com.stu.entity.Score;

@Repository("scoreDao")
public class ScoreDaoImpl extends BaseDao implements IScoreDao{

	@Override
	public boolean addScore(Score score) {
		try {
			getSession().save(score);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateScore(Score score) {
		try {
			getSession().update(score);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteScore(Score score) {
		try {
			getSession().delete(score);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<?> findScoreList(String hql) {
		return getSession().createQuery(hql).list();
	}

	@Override
	public Score getScoreById(int sno) {
		return getSession().get(Score.class, sno);
	}

}
