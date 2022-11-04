package myJava.bootcamp.section7.encapsulation;

public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "kanjo";
//        player.health = 20;
//        player.weapon = "ak-47";
//
//        System.out.println(player.healthRemaining());
//        player.loseHealth(10);
//        System.out.println(player.healthRemaining());
//        player.loseHealth(12);
//        System.out.println(player.name);




        EnhancedPlayer player = new EnhancedPlayer("kanjo", 100, "sword");
        player.loseHealth(25);
        System.out.println(player.getHealth());
//        System.out.println(player.name);



    }
}