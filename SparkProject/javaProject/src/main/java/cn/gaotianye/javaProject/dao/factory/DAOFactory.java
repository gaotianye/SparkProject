package cn.gaotianye.javaProject.dao.factory;

import cn.gaotianye.javaProject.dao.ITaskDAO;
import cn.gaotianye.javaProject.dao.impl.TaskDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {

	/**
	 * 获取任务管理DAO
	 * @return DAO
	 */
	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}
	
}
