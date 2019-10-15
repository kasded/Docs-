package lv.javaguru.HomeWork2;

//OK
public class Circle {
    double radius; //šim ir jābūt "private", jo objekta stāvokli drīkst mainīt tikai izmantojot metodes

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
