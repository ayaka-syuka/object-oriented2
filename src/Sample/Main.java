package Sample;

public class Main {
    public static void main(String[] args) {
        
        Manager manager1 = new Manager(); //Manager[] managers = new Manager[3] で最初に配列を作成するのもあり

        manager1.setName("Taro Yamada");
        manager1.setId(101);
        manager1.setSalary(80000.0);
        manager1.setDepartment("sales");

        Manager manager2 = new Manager();

        manager2.setName("Hanako Suzuki");
        manager2.setId(102);
        manager2.setSalary(90000.0);
        manager2.setDepartment("Marketing");

        Manager manager3 = new Manager();

        manager3.setName("Ichiro Tanaka");
        manager3.setId(103);
        manager3.setSalary(85000.0);
        manager3.setDepartment("HR");

        Manager[]managers = new Manager[3];
        managers[0] = manager1;
        managers[1] = manager2;
        managers[2] = manager3;

        for(Manager manager : managers){
            System.out.println(manager);
        }



    }

}
