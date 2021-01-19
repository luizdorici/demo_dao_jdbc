package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TESTE 1 - Department Find by Id =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n===== TESTE 2 - Department Find All =====");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		sc.close();
	}

}
