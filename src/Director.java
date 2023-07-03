import builder.CarBuilder;
import builder.CarManualBuilder;

public class Director {
    void makeCar(CarBuilder builder) {
        builder.setSeats(4);
        builder.setEngine("FireMax 777");
        builder.setTripComputer();
        builder.setGPS();
        builder.getProduct();
    }

    void makeManual(CarManualBuilder builder) {
        builder.setSeats(2);
        builder.setEngine("SportRace 101");
        builder.setTripComputer();
        builder.setGPS();
        builder.getProduct();
    }
}
