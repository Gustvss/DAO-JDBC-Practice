package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TESTE 1: seller findById ===");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);
    }

}