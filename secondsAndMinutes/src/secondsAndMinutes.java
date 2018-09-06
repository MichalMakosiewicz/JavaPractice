public class secondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(2223, 46));
        System.out.println(getDurationString(12345, 23));
        System.out.println(getDurationString(234, 12));

        System.out.println(getDurationString(1234578765));

    }

    public static String getDurationString(long minutes, long seconds){

        if (minutes < 0 || seconds<0 || seconds>59){
            return "Invalid Value";
        }

        long extraMinutes = seconds/60;
        long extraHours = (extraMinutes + minutes)/60;
        long leftMinutes = (extraMinutes + minutes)%60;
        long leftSeconds = seconds%60;

        String hoursString = extraHours + "h";
        if (extraHours<10){
            hoursString = "0"+hoursString;
        }

        String minutesString = leftMinutes + "m";
        if (leftMinutes<10){
            minutesString = "0"+minutesString;
        }

        String secondsString = leftSeconds + "s";
        if (leftSeconds<10){
            secondsString = "0"+secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + " ";

    }

    public static String getDurationString(long seconds){

        if (seconds<0){
            return "Invalid Value";
        }

        long leftSeconds = seconds%60;
        long minutes = seconds/60;


        return getDurationString(minutes,leftSeconds);


    }
}
