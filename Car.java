public class Car extends Vehicle {

    public Car(String band, int kilometers) {
        super(band, kilometers);
    }

    @Override
    public String doStuff() {
        return "vroum vroum !";
    }
}