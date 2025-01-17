package Sample;

public class InstantiateCar {

    public static void main(String[] args) {
        Car estima = new Car();

        estima.setSpeed(30);
        estima.setName("エスティマ");

        System.out.println("スピードは" + estima.getSpeed());
        System.out.println("名前は" + estima.getName());

    }
}
