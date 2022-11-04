package myJava.basics;
// swapping two variable.
// x = value0
// y = value1
// temp = x = value0
// x = y = value1
// y = temp = value 0

public class SwapVar {
    public static void main(String[] args) {
        // a glass named x containing milk and y named containing juice.
        String x = "Milk";
        String y = "juice";
        System.out.println("x: "+x);
        System.out.println("y: "+y+"\n");
        // less now try to swap both of these variable
//        x=y;
//        System.out.println("x: "+x);
//        System.out.println("y: "+y);
        // not really working

        // so let's bring another glass and call it temp container.
        String temp;
        // let's put milk on that temp container.
        temp = x;
        // now glass(x) that contained milk is empty now, so let's put juice on it.
        x = y;
        // now the glass y which once consisted milk is now containing juice.
        // now let's empty out the temp container(milk) on glass y which is empty
        //     now which was once containing juice.
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y+"\n");
        // hence swapped.
    }
}
