package java.basics;
// 19

public class EvenOdd{
    public static void main(String[] args){
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                continue;
            }

            else if (i == 50){
                break;
            }

            else{
                System.out.println(i);
            }
        }
    }
}