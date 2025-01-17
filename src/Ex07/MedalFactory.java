package Ex07;

public class MedalFactory {

    private Employee[] employees;

    public int getTotalsalary(){
        int totalsalary = 0;
        for (Employee employee : employees){
            totalsalary += employee.getSalary();
        }
        return totalsalary;
    }

    public Medal[] makeMedal(Material[] materials){   //Material[] materials を使ってMedal[](配列)をつくる　→Medal[]を戻り値として返す
        Medal[] medals = new Medal[materials.length]; // [material.length](materialの数分の)Medalの配列を作成する
        for(int i = 0; i <materials.length; i++){
            Medal medal = new Medal();  //medalクラスからインスタンス化
            if("金".equals(materials[i].getName())){
                medal.setName("金メダル");
                int price = (int)(materials[i].getCost() + (getTotalsalary() / materials.length) * 1.2);
                medal.setPrice(price);
            }else if("銀".equals(materials[i].getName())){
                medal.setName("銀メダル");
                int price = (int)(materials[i].getCost() + (getTotalsalary() / materials.length) * 1.2);
                medal.setPrice(price);
            }else if("銅".equals(materials[i].getName())){
                medal.setName("銅メダル");
                int price = (int)(materials[i].getCost() + (getTotalsalary() / materials.length) * 1.2);
                medal.setPrice(price);
            }else {
                medal.setName("不良品");
                medal.setPrice(0);

            }
            medals[i] = medal;

        }
        return medals;
    }
}
