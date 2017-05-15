package cn.gaotianye.test;

import cn.gaotianye.javaProject.dao.ITaskDAO;
import cn.gaotianye.javaProject.dao.factory.DAOFactory;
import cn.gaotianye.javaProject.domain.Task;

/**
 * 任务管理DAO测试类
 * @author Administrator
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(1);
		System.out.println(task.getTaskName());  
	}
	
}
