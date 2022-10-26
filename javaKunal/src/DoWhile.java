
// 16

// the difference between do while and while loop is that the do part will atleast
// be going to execute for one time, even the condition is true or not, whereas,
// simple while loop won't. So a while loop will first check the condition and then
// execute the body, but a do-while loop will first execute the body for the first
// time and then check the condition if the condition does not match then it'll stop.

public class DoWhile{
    public static void main(String[] args){
        int i = 0;
//        do {
//            System.out.println(i);
//            i ++;
//        }
//        while (i < 10);
        // to prove that do condition is excuted first and then the condition is
        // checked.
        do {
            System.out.println("Hello world");
        }while(i !=0);
    }
}