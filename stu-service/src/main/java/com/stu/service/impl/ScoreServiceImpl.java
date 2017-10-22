package com.stu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stu.dao.IScoreDao;
import com.stu.entity.Score;
import com.stu.service.IScoreService;

@Service("scoreService")
public class ScoreServiceImpl implements IScoreService {

	@Resource(name = "scoreDao")
	private IScoreDao scoreDao;
	
	@Override
	public boolean addScore(Score score) {
		return scoreDao.addScore(score);
	}

	@Override
	public boolean updateScore(Score score) {
		return scoreDao.updateScore(score);
	}

	@Override
	public boolean deleteScore(Score score) {
		return scoreDao.deleteScore(score);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Score> findScoreList() {
		String hql = "from Score s left join s.stu order by s.schinese, s.smathematics, s.senglish, s.sphysics, s.schemistry, s.sbiology, s.sgeography, s.spolitics, s.shistory";
		return (List<Score>) scoreDao.findScoreList(hql);
	}

	@Override
	public Score getScoreById(int sno) {
		return scoreDao.getScoreById(sno);
	}

	public void setScoreDao(IScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
}
