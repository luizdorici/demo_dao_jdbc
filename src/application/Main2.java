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
		
		System.out.println("\n===== TESTE 3 - Department Insert =====");
		Department newDepartment = new Department(null, "Musica");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n===== TESTE 4 - Department Update =====");
		department = departmentDao.findById(6);
		department.setName("Games");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		sc.close();
	}

}
