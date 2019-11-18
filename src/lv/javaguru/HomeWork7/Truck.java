package lv.javaguru.HomeWork7;

public class Truck implements Car {

    public void cargo() {
        System.out.println("Trucks can take in a lot of cargo");
    }

    @Override
    public void engine() {
        System.out.println("Trucks engine can be is 5.7 Litres");
    }

    @Override
    public void gears() {
        System.out.println("Truck has 10 gears on average");

    }

    @Override
    public void tyres() {
        System.out.println("Trucks have 6 to 8 tyres");

    }
}
