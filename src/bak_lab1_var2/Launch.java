package bak_lab1_var2;

public class Launch {

        public static void main(String[] args) {
        Drone1 drone1 = new Drone1();
        System.out.println(drone1);
        Drone1 drone1_1 = new Drone1("простой");
        System.out.println(drone1_1);
        Drone1 drone1_2 = new Drone1(true);
        System.out.println(drone1_2);
        Drone1 drone1_3 = new Drone1("профессиональный", true);
        System.out.println(drone1_3 + "\r\n");
        

        Drone2 drone2 = new Drone2();
        System.out.println(drone2);
        Drone2 drone2_1 = new Drone2("простой", "PNP");
        System.out.println(drone2_1);
        Drone2 drone2_2 = new Drone2(true, "BNF");
        System.out.println(drone2_2);
        Drone2 drone2_3 = new Drone2("профессиональный", true, "BNF");
        System.out.println(drone2_3  + "\r\n");
        
        Drone3 drone3 = new Drone4();
        System.out.println(drone3);
        Drone3 drone3_1 = new Drone4("гоночный", true, "ARF", 100);
        System.out.println(drone3_1);
        
        drone3.goUp("Вверх");
        drone3.goDown("Вниз");
        drone3.speedUp("2 kм/ч");
        
        Drone4 drone4 = new Drone4();
        System.out.println(drone4);
        drone4.slowDown("4 км/ч");
       
    }
    
}
