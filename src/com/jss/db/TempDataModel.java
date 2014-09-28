package com.jss.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jss.dao.HibernateUtil;
import com.jss.dao.Log4jUtil;
import com.jss.entity.TempData;

public class TempDataModel {
	
	public boolean addData(TempData tempData) {
		Session session = HibernateUtil.openSession();		
		Transaction tx = null;
		Logger logger=Log4jUtil.getLoggerObj();
		try {
			tx = session.getTransaction();
			tx.begin();
			session.save(tempData);
			tx.commit();
			logger.info("subject="+tempData.getSubject()+"  body="+tempData.getBody()+" author="+tempData.getAuthor()+" imgURL="+tempData.getImgURL()+" yes Inserted");
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			logger.info("subject="+tempData.getSubject()+"  body="+tempData.getBody()+" author="+tempData.getAuthor()+" imgURL="+tempData.getImgURL()+"ohh no!!!! not Inserted!!!!!");
			return false;
		} finally {
			session.close();
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public List<TempData> getListOfData() {
		List<TempData> list = new ArrayList<TempData>();
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from TempData").list();

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {

			session.close();
		}
		return list;
	}

}
