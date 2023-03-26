package appProgram;

import irs.AdressBook;
import irs.Legal;
import irs.Person;
import product.customs.ImportProduct;
import product.customs.Product;
import product.customs.UsedProduct;

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
        //List<Product> productList = new ArrayList<>();
        List<AdressBook> adressBooks = new ArrayList<>();


       /* System.out.print("Enter the numbers of products: ");
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
        }*/

        System.out.print("Enter the numbers of tax payers: ");
        Integer nPayers = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= nPayers; i++){
            System.out.printf("Tax payer #%d data: %n", i);
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String namePayers = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIC = sc.nextDouble();

            if (ic == 'i'){
                System.out.print("Health expenditures: ");
                Double healthE = sc.nextDouble();
                adressBooks.add(new Person(namePayers, anualIC, healthE));
            }
            else {
                System.out.print("Number of employees: ");
                Integer healthE = sc.nextInt();
                adressBooks.add(new Legal(namePayers, anualIC, healthE));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0;
        for (AdressBook ab: adressBooks) {
            System.out.println(ab);
            sum += ab.taxesPaid();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);


        sc.close();
    }
}
