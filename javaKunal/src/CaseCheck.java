
//24

import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String alpha = input.nextLine();
        if (alpha == alpha.toUpperCase()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}