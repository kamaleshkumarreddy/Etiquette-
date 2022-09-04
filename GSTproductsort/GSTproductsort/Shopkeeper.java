package GSTproductsort.GSTproductsort;

import java.util.ArrayList;
import java.util.Scanner;
public class Shopkeeper {

    public static void main(String[] args) {

        String productName;
        double productPrice;
        double gstValue;
        double totalPrice = 0;
        char choice;
        Scanner s = new Scanner(System.in);

        ArrayList<Product> productList = new ArrayList<Product>();

        do
        {
            System.out.println("Enter Product Name:");
            productName = s.next();
            System.out.println("Enter Price:");
            productPrice = s.nextFloat();
            System.out.println("Enter GST percentage");
            gstValue = s.nextInt();

            if(gstValue>0.0)
            {
                totalPrice = productPrice + (productPrice*gstValue*0.01);
            }

            productList.add(new Product(productName, productPrice, totalPrice, gstValue));
            System.out.println("want to add another item");
            choice = s.next().charAt(0);

        }while(choice=='y' || choice=='Y');

        for(Product p : productList)
        {
            p.filterProducts();
        }


    }


}
