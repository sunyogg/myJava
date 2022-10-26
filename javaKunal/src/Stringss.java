
// 11

// Since Strings are object in java there we can use different methods to modify Strings.

public class Stringss {
    public static void main(String[] args){
        String sentence = "Hello, How are you.";
        String fname = "Sunyog";
        String lname = "Lodhi";
        System.out.println(sentence.length());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.getBytes());
        System.out.println(sentence.indexOf("you"));

        // concatenation
        System.out.println(fname +" "+ lname);
        System.out.println(fname.concat(lname));

        // Numbers and String
        // Num + Num -> Addition
        // String + String -> String concatenation
        // Num + String -> String concatenation
        int num = 20;
        String str = "20";
        System.out.println(num + str); // This will result in String concatenation.


        // Java Special character

        // \n	New Line
        // \r	Carriage Return
        // \t	Tab
        // \b	Backspace
        // \f	Form Feed
        String quo = "They asked\"How are you?\" \\";
        String n = "Hey\nHow are you? \t I am fine";
        System.out.println(quo);
        System.out.println(n);

    }
}