package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("===== TESTE 1 - Find by Id =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n===== TESTE 2 - Find by Department =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller sell : list) {
			System.out.println(sell);
		}
	}

}
