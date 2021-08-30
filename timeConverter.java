
import java.util.Scanner;

public class timeConverter {
    static void converter (String fTime) {
        String hour_0 = String.valueOf(fTime.charAt(0));        // 2 char.s of the hours part are converted to strings 
        String hour_1 = String.valueOf(fTime.charAt(1));

        String minute_0 = String.valueOf(fTime.charAt(3));      // 2 char.s of the minutes part are converted to strings
        String minute_1 = String.valueOf(fTime.charAt(4));

        String second_0 = String.valueOf(fTime.charAt(6));      // 2 char.s of the seconds part are converted to strings
        String second_1 = String.valueOf(fTime.charAt(7));

        String hour = String.join("", hour_0, hour_1);          // join two hour strings into a single string
        int hours = Integer.parseInt(hour);                     // convert joined string to an int

        String minute = String.join("", minute_0, minute_1);
        int minutes = Integer.parseInt(minute);

        String second = String.join("", second_0, second_1);
        int seconds = Integer.parseInt(second);

        if (fTime.charAt(fTime.length() - 2) == 'P'){           // convert afternoon
            if (hours != 12) {
                hours +=12;
                
            }
        }else {
            if (hours == 12) {                                  // check for midnight
                hours = 0;

            }
        }
        String h = String.format("%02d", hours);                // add leading zeros
        String m = String.format("%02d", minutes);
        String s = String.format("%02d", seconds);

        System.out.print (h);
        System.out.print (':');
        System.out.print(m);
        System.out.print(':');
        System.out.print(s);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String time = scanner.next();
        scanner.close();
        //String time = "12:45:30AM";
        //System.out.println(time.charAt(1));
        converter (time);

    }
}
