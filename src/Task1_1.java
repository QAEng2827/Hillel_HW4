import sun.util.calendar.BaseCalendar;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class Task1_1 {


/*Write a java program which print in console what day of the week is today. Use Enum with list of days.*/

    private enum DayOfWeek{
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);

        private int value;
        DayOfWeek(int value) {
            this.value=value;
        }
    }

    public static int getTodaysDayOfWeek() {
        final Calendar c = Calendar.getInstance();
        return c.get(Calendar.DAY_OF_WEEK);
    }



    public static void main(String[] args) {

        int noweday = (int)getTodaysDayOfWeek();
        for (DayOfWeek day : DayOfWeek.values()) {
       if (noweday== day.value){
         System.out.printf("Today is %s", day);
     }


}










	// write your code here
    }
}
