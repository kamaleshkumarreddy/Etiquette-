package GSTproductsort.GSTproductsort;

public class Product {

    String productName;
    double productPrice;
    double totalPrice;
    double gstValue;



    public Product(String name, double price, double total, double gst) {

        productName = name;
        productPrice = price;
        totalPrice = total;
        gstValue = gst;

    }

    public void filterProducts() {

        if(totalPrice>=2000 && gstValue>0)
        {
            System.out.println("Product "+productName+", Product Price:"+totalPrice);
        }
    }

}
