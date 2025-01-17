package Sample;

public class Zoo {

    public static void main(String[] args) {
        
        Animal[] animals = new Animal[5];

        Sheep sheep = new Sheep();
        Horse horse = new Horse();
        Goat goat = new Goat();
        Monkey monkey = new Monkey();
        Bear bear = new Bear();

        animals[0] = sheep;
        animals[1] = horse;
        animals[2] = goat;
        animals[3] = monkey;
        animals[4] = bear;

        for(Animal animal:animals){
            animal.cry();

    

        }




    }

}
