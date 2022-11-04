package myJava.bootcamp.section5.challenges;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int min = 0;
      int max = 0;
      boolean flagForFirst = true;
      // if you ever wanna check if the loop is running for the first time.

      while (true) {
          boolean isInt = input.hasNextInt();
          if (isInt) {
              int num = input.nextInt();

              if (flagForFirst) {
                  min = num;
                  max = num;
                  flagForFirst = false;
              }
              if (num > max) {
                  max = num;
              }
              if (num < min) {
                  min = num;
              }
          } else {
              System.out.println("Invalid number.");
              break;
          }
          input.nextLine();
      }
      input.close();
        System.out.println(min);
        System.out.println(max);
    }
}