package lv.javaguru.HomeWork2;

public class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return 3.14 * radius * radius;
    }
}
