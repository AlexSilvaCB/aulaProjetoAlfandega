package appProgram;

import entities.product.ImportProduct;
import entities.product.Product;
import entities.product.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the numbers of products: ");
        Integer numberProducts = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= numberProducts; i++){

            System.out.printf("Product #%d data: %n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char cui = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            Double priceProduct = sc.nextDouble();

            if (cui == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY) ");
                Date dateProduct = sdf.parse(sc.next());
                productList.add(new UsedProduct(nameProduct, priceProduct, dateProduct));
            }
            else if(cui == 'i'){
                System.out.print("Customs fee: ");
                Double feeProduct = sc.nextDouble();
                productList.add(new ImportProduct(nameProduct, priceProduct, feeProduct));
            }
            else {
                productList.add(new Product(nameProduct, priceProduct));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product list: productList) {
            System.out.println(list.priceTag());
        }
    }
}