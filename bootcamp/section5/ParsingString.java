package myJava.bootcamp.section5;

public class ParsingString {

    public static void main(String[] args) {
        String stringAsNumber = "1234";
        System.out.println("String = " + stringAsNumber);
        int intFromString = Integer.parseInt(stringAsNumber);
        System.out.println("Number = " + intFromString);

        System.out.println("After adding one in string = " + stringAsNumber + 1);
        System.out.println("After adding one in int = " + intFromString + 1);

        String stringAsDouble = "4321.1678";
        double doubleFromString = Double.parseDouble(stringAsDouble);
        System.out.println("String = " + stringAsDouble);
        System.out.println("Double = " + doubleFromString);

        System.out.println("After adding one in string = " + stringAsDouble + 1);
        System.out.println("After adding one in double = " + doubleFromString + 1);
    }
}