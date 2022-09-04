package FruitBowl;

public class Bowl {

    String fruitName;
    String fruitColor;
    public Bowl(String name, String color) {
        fruitName = name;
        fruitColor = color;
    }

}

class BananaBowl extends Bowl
{

    public BananaBowl(String name, String color) {
        super(name, color);
        // TODO Auto-generated constructor stub
    }
}

class OrangeBowl extends Bowl
{

    public OrangeBowl(String name, String color) {
        super(name, color);
        // TODO Auto-generated constructor stub
    }
}

class AppleBowl extends Bowl
{

    public AppleBowl(String name, String color) {
        super(name, color);
        // TODO Auto-generated constructor stub
    }
}
