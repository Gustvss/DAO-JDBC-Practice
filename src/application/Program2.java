package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.Impl.DepartmentDaoJDBC;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TESTE 1: seller findById ===");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("\n=== TESTE 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
            }
    }

}