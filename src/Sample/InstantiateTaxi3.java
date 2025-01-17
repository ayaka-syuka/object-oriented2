package Sample;

public class InstantiateTaxi3 {
    public static void main(String[] args) {
        
        System.out.println("タクシーを走らせます");
        Taxi taxi = new Taxi();
        taxi.stepOnAccele();

        System.out.println("車を走らせます"); //Carクラスのメソッドは変わらないままだよの意味で書いた
        Car car = new Car();
        car.stepOnAccele();
        
    }

}
