import builder.CarBuilder;
import builder.CarManualBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.makeCar(new CarBuilder());
        director.makeManual(new CarManualBuilder());
    }
}
