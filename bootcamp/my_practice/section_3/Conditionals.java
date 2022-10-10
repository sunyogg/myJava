public class Conditionals {
    public static void main(String[] args) {

//        How the f is this thing working? HAHAHA
//        boolean isAlien = true;
//        if (isAlien == false)System.out.println("There are no alien.");else if (true)System.out.println("There are aliens");


//        If we don't use the codeblock with the if then statement then, only the//       // first line would be considered within the if-then statement whereas
//        all the line after that first line will be considered as normal and
//        will always be executed no matter whether the condition evaluates to
//        true or false.
//        boolean isAlien = true;
//        if (isAlien == false)
//            System.out.println("There are no aliens");
//            System.out.println("And i am scared of aliens");
//
//        boolean isAlien1 = true;
//        if (isAlien1 == false) {
//            System.out.println("There are no aliens");
//            System.out.println("And i am scared of aliens");
//        }
        int firstScore = 100;
        int secondScore = 80;
        int myScore = 70;
        // you see below, How or operator only need one condition to be true for
        // the whole statement to be true.
        // so if you want both the condition to be true for a certain code to run
        // then you should always use 'and' operator.
        if ((myScore<firstScore) || (myScore>secondScore)) {
            System.out.println("You got Second place.");
        }

        // assignment operator returns the value, it has been assigned to the
        // variable and equal to operator returns the value true or false, to the
        // variable it has been assigned to.

        // we are using assignment operator here in if statement still we are
        // not getting any error, because it's of boolean type and we know that
        // anything inside the if statement has to be of type boolean i.e. true
        // or false
        boolean isCar = false;
        if (isCar = false){
            // so here: isCar = true is RETURNING 'true'
            // and also assigning the value to true
            System.out.println("This was not supposed to be executed.");
        }
        if (!isCar){
            System.out.println("isCar is true");
        }
        System.out.println();

        // ternary operator
        // so what really is happening here is that the boolean value of one variable
        // depends upon the boolean value of another variable.
        // Ex - below statement is stating that if isCar is true set wasCar to false
        //      if isCar is false set wasCar to true.

        // The ternary operator is a shortcut to assigning one of two values to a
        // variable depending on a given condition.
        // It's a shortcut for if-else statement.
        isCar = false;
        boolean wasCar = (isCar) ? true : false;
        System.out.println("isCar = " + isCar);
        System.out.println("wasCar = " + wasCar);

    }
}
