import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(10,20);
        /*
            rectangle.setWidth(50);
            System.out.println("Expects 10: " + rectangle.getLength());
            System.out.println("Expects 20: " + rectangle.getWidth());
        */
        ArrayList<TwoDimensionalShape> arrayList = new ArrayList<>();
        arrayList.add(new Rectangle(10,20));
        arrayList.add(new Rectangle(20,30));
        arrayList.add(new Circle(10));
        arrayList.add(new Circle(30));
        arrayList.add(new Triangle(60,10));
        arrayList.add(new Triangle(30,10));



        // loop over the array list and display the toString() with area
        for (TwoDimensionalShape shape : arrayList)
        {
            System.out.printf("%s with area: %.1f%n",shape.toString(), shape.getArea());
        }
        }
    }
}
