public abstract class Vehicle {

    //attributs
    private String band;
    private int kilometers;

    //constructeurs
    public Vehicle(String band, int kilometers) {
        this.band = band;
        this.kilometers = kilometers;
    }

    //getters et setters
    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
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