public class Hangar {

    public static void main(String[] args) {
        
        Car clio = new Car("Clio", 0);

        System.out.println("Je suis " + clio.getBand() + " et je fais " + clio.doStuff());
        
        Boat titanic = new Boat("Titanic", 0);

        System.out.println("Je suis " + titanic.getBand() + " et je fais " + titanic.doStuff());
    }
}