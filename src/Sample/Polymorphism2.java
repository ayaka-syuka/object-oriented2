package Sample;

public class Polymorphism2 {

    public static void main(String[] args) {
        
        Car car = null;

        car = new Taxi();

        car.stepOnAccele();

        
        
        car = new Bus();

        car.stepOnAccele();

    }
}
