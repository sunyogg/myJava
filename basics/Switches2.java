package myJava.basics;
// 28
// using switches differently like in some case we don't need those break statement.
// and also sometimes we'll need to use nested switch statement.
import java.util.Scanner;

public class Switches2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Weekdays.");
                break;
            case 6 :
            case 7 :
                System.out.println("Weekend");
                break;
        }


//        int x = input.nextInt();
//        int y = input.nextInt();
//
//        switch (x){
//            case 1:
//                System.out.println("1");
//                switch (y){
//                    case 1:
//                    System.out.println("one");
//            } break;
//
//            case 2 :
//                System.out.println("2");
//                switch (y){
//                    case 2:
//                        System.out.println("two");
//                } break;
//        }
    }
}
