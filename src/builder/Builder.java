package builder;

import carProduct.Car;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer();
    void setGPS();
}
