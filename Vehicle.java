public abstract class Vehicle {

    //attributs
    private String brand;
    private int kilometers;

    //constructeurs
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getters et setters
    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    //méthodes
    public abstract String doStuff();
}