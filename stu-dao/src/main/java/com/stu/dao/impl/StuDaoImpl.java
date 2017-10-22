package com.stu.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stu.dao.IStuDao;
import com.stu.entity.Stu;

@Repository("stuDao")
public class StuDaoImpl extends BaseDao implements IStuDao {

	@Override
	public boolean addStu(Stu stu) {
		try {
			getSession().save(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateStu(Stu stu) {
		try {
			getSession().update(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteStu(Stu stu) {
		try {
			getSession().delete(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<?> findStuList(String hql) {
		return getSession().createQuery(hql).list();
	}

	@Override
	public Stu getStuById(int sno) {
		return getSession().get(Stu.class, sno);
	}

}
