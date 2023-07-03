package builder;

import carProduct.Car;

import static java.lang.String.format;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        System.out.printf("%d seats were installed%n", number);
    }

    @Override
    public void setEngine(String engine) {
        System.out.println("Engine" + engine + "was installed");
    }

    @Override
    public void setTripComputer() {
        System.out.println("Trip computer was installed");
    }

    @Override
    public void setGPS() {
        System.out.println("GPS was installed");
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        System.out.println("Car is ready");
        return product;
    }
}
