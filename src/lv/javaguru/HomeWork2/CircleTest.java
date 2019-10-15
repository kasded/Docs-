package lv.javaguru.HomeWork2;

//Ok
public class CircleTest {
    public static void main(String[] args) {


        Circle circle = new Circle();
        circle.setRadius(5.0);

        double input = circle.getRadius();
        double result = circle.calculateArea();

        System.out.println("input " + input);
        System.out.println("Area of radius is " + result);
    }
}