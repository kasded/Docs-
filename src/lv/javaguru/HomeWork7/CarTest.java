package lv.javaguru.HomeWork7;

//Ok
public class CarTest {
    public static void main(String[] args) {

        CarTest carTest = new CarTest();
        carTest.passengerCarTest();
        carTest.busTest();
        carTest.truckTest();

    }

    private void differentCars(Car car) {
        car.engine();
        car.gears();
        car.tyres();

    }

    public void passengerCarTest() {

    }

    {
        PassengerCar passengerCar = new PassengerCar();
        differentCars(passengerCar);
        passengerCar.passengers();
    }

    public void busTest() {
        Bus bus = new Bus();
        differentCars(bus);
        bus.busPassengers();

    }

    public void truckTest() {
        Truck truck = new Truck();
        differentCars(truck);
        truck.cargo();
    }


}

