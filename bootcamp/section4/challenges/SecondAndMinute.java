package java.bootcamp.section4.challenges;

public class SecondAndMinute {


    private static final String INVALID_VALUE = "Invalid Value"; // Constants
    public static String getDurationString(int minute, int second) {
        if ((minute < 0) || (second < 0 || second > 59)) {
            return INVALID_VALUE;
        }
        int hour = minute / 60;
        int minute1 = minute % 60;
        return formatAndReturnTime(hour, minute1, second);
    }

    public static String getDurationString(int second) {
//        int hour = second / 3600;
//        int minute = (second % 3600)/60;
//        int second1 = second - (hour * 3600 + minute * 60);
        if (second < 0) {
            return INVALID_VALUE;
        }
        int minute = second / 60;
        int second1 = second % 60;
        return getDurationString(minute, second1);
    }

    private static String formatAndReturnTime(int hour, int minute,
                                              int second) {
        String hourString;
        String minuteString;
        String secondString;
        if (hour < 10) {
            hourString = "0" + hour;
        }
        else {
            hourString = "" + hour;
        }
        if (minute < 10) {
            minuteString = "0" + minute;
        }
        else {
            minuteString = "" + minute;
        }
        if (second < 10) {
            secondString = "0" + second;
        }
        else {
            secondString = "" + second;
        }
        String statement = hourString + "h " + minuteString + "m " +
                secondString + "s";
        return statement;
    }
}