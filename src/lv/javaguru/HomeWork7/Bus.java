package lv.javaguru.HomeWork7;
//Ok
public class Bus implements Car {

    public void busPassengers() {
        System.out.println("Buses have a lot of passengers");
    }


    @Override
    public void engine() {
        System.out.println("Bus engine is 2.0 Litres");
    }

    @Override
    public void gears() {
        System.out.println("Bus have 6 gears");

    }

    @Override
    public void tyres() {
        System.out.println("Buses have 4 tyres");

    }
}
