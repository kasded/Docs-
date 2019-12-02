package lv.javaguru.HomeWork7;
//Ok
public class PassengerCar implements Car {

    public void passengers() {
        System.out.println("Can hold 5 passengers");
    }


    @Override
    public void engine() {
        System.out.println("Passenger Cars engine is 2.5 Litres");
    }

    @Override
    public void gears() {
        System.out.println("Passenger Cars have 5 Gears");

    }

    @Override
    public void tyres() {
        System.out.println("Passenger Cars have 4 tyres");

    }


}
