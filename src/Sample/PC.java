package Sample;

public class PC implements Electrical{

    private boolean powerOn;

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    @Override
    public void power(){
        if(powerOn){
            System.out.println("PCの電源が切れました");
            powerOn = false;

        } else{
            System.out.println("設定のファイルを読み込んでいます");
            powerOn = true;
            System.out.println("PCの電源が入りました");
        }


    }



}
