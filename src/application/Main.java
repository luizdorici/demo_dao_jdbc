package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("===== TESTE 1 - Seller Find by Id =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== TESTE 2 - Seller Find by Department =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller sell : list) {
			System.out.println(sell);
		}
		
		System.out.println("\n===== TESTE 3 - Seller Find All =====");
		list = sellerDao.findAll();
		for(Seller sell : list) {
			System.out.println(sell);
		}
		
		System.out.println("===== TESTE 3 - Seller Insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	}

}
