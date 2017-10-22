package com.stu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stu.dao.IScoreDao;
import com.stu.dao.IStuDao;
import com.stu.entity.Score;
import com.stu.entity.Stu;
import com.stu.service.IStuService;

@Service("stuService")
public class StuServiceImpl implements IStuService {

	@Resource(name = "stuDao")
	private IStuDao stuDao;
	
	@Resource(name = "scoreDao")
	private IScoreDao scoreDao;
	
	@Override
	public boolean addStu(Stu stu) {
		return stuDao.addStu(stu);
	}

	@Override
	public boolean updateStu(Stu stu) {
		return stuDao.updateStu(stu);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean deleteStu(Stu stu) {
		String hql = "from Score s where s.stu.sno=" + stu.getSno();
		List<Score> sList = (List<Score>) scoreDao.findScoreList(hql);
		for (Score score : sList) {
			scoreDao.deleteScore(score);
		}
		return stuDao.deleteStu(stu);
	}

	@Override
	public List<?> findStuList() {
		String hql = "from Stu s order by s.sno";
		return stuDao.findStuList(hql);
	}

	@Override
	public Stu getStuById(int sno) {
		return stuDao.getStuById(sno);
	}

	public void setStuDao(IStuDao stuDao) {
		this.stuDao = stuDao;
	}

	public void setScoreDao(IScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}

}
