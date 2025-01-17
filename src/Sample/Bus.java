package Sample;

public class Bus extends Car {

    int price;

   
    @Override
    public void stepOnAccele(){
        super.stepOnAccele();
        price = price + 30;
        System.out.println("料金は" + price + "円です");
    }


    }



