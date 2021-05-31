package commonclass.date;

import java.util.Calendar;

/**
 * @author: Samuel
 * @date: 2021/4/7 19:15
 */
public class TestDate {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR,2021);
        calendar.set(Calendar.MONTH,3);
        calendar.set(Calendar.DAY_OF_MONTH,7);
        System.out.println((calendar.getTime()).getTime());


    }
}
