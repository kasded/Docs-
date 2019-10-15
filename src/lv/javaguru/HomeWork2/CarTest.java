package lv.javaguru.HomeWork2;

//neizmantotos impoorts jāizdzēš pirms komita
import java.awt.*;

//Ok
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColour("Black");
        car.setManufacturer("Tesla");
        car.setYear(2019);

        String carModel = car.getManufacturer();
        String carColor = car.getColour();
        int year = car.getYear();

        System.out.println("The car is a " + carModel + " and its color is " + carColor + ". Made in " + year);

    }
}
