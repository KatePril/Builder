package builder;

import carProduct.Car;
import carProduct.Manual;

public class CarManualBuilder implements Builder{
    private Manual manual;

    public CarManualBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        System.out.printf("%d seats were included%n", number);
    }

    @Override
    public void setEngine(String engine) {
        System.out.println("Engine" + engine + "was included");
    }

    @Override
    public void setTripComputer() {
        System.out.println("Trip computer was included");
    }

    @Override
    public void setGPS() {
        System.out.println("GPS was included");
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        System.out.println("Manual is ready");
        return product;
    }
}
