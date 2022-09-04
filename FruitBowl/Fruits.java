package FruitBowl;

import java.util.ArrayList;
import java.util.Scanner;

public class Fruits {

    public static void main(String[] args) {
        String fruitName;
        String fruitColor;
        char choice;
        Scanner s = new Scanner(System.in);
        ArrayList<Bowl> bowlList = new ArrayList<Bowl>();
        ArrayList<BananaBowl> bananaBowlList = new ArrayList<BananaBowl>();
        ArrayList<AppleBowl> appleBowlList = new ArrayList<AppleBowl>();
        ArrayList<OrangeBowl> orangeBowlList = new ArrayList<OrangeBowl>();

        do {
            System.out.println("Enter fruit name:");
            fruitName = s.next();
            System.out.println("Enter fruit color");
            fruitColor = s.next();
            bowlList.add(new Bowl(fruitName, fruitColor));
            System.out.println("Do you want to add a fruit");
            choice = s.next().charAt(0);
        }while(choice == 'y'|| choice=='Y');

        for(Bowl b : bowlList)
        {
            if(b.fruitName.equalsIgnoreCase("Banana"))
            {
                bananaBowlList.add(new BananaBowl(fruitName, fruitColor));
            }
            else if (b.fruitName.equalsIgnoreCase("Orange")) {
                orangeBowlList.add(new OrangeBowl(fruitName, fruitColor));
            }
            else if (b.fruitName.equalsIgnoreCase("Apple")) {
                appleBowlList.add(new AppleBowl(fruitName, fruitColor));

            }
        }
        System.out.println("Bananas in banana bowl "+bananaBowlList.size());
        System.out.println("Oranges in orange bowl "+orangeBowlList.size());
        System.out.println("Apples in apple bowl "+appleBowlList.size());

    }
}
