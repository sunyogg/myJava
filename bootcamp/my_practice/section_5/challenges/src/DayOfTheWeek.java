public class DayOfTheWeek {

    private static final String FORINVALID = "Invalid Value";

    public static void main(String[] args) {

        printDayOfTheWeek(9);
        printDayOfTheWeekIf(4);

    }

    public static void printDayOfTheWeek(int day_in_number) {
        switch (day_in_number) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println(FORINVALID);
        }
    }

    public static void printDayOfTheWeekIf(int day_in_num) {
        if (day_in_num == 1) {
            System.out.println("Monday");
        }
        else if (day_in_num == 2) {
            System.out.println("Tuesday");
        }
        else if (day_in_num ==  3) {
            System.out.println("Wednesday");
        }
        else if (day_in_num == 4) {
            System.out.println("Thursday");
        }
        else if (day_in_num == 5) {
            System.out.println("Friday");
            }
        else if (day_in_num == 6) {
            System.out.println("Saturday");
        }
        else if (day_in_num == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println(FORINVALID);
        }
    }
}