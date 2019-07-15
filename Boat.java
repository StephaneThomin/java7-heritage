public class Boat extends Vehicle {

    public Boat(String band, int kilometers) {
        super(band, kilometers);
    }

    @Override
    public String doStuff() {
        return "glou glou !";
    }
}