package commonclass.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class NewDateDemo {
    public static void main(String[] args) {
        //LocalDate d = LocalDate.now(); // 当前日期
        //LocalTime t = LocalTime.now(); // 当前时间
        //LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间

        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        LocalDate d = dt.toLocalDate(); // 转换到当前日期
        LocalTime t = dt.toLocalTime(); // 转换到当前时间
        System.out.println(d); // 严格按照ISO 8601格式打印
        System.out.println(t); // 严格按照ISO 8601格式打印
        System.out.println(dt); // 严格按照ISO 8601格式打印

        System.out.println("==================");

        // 指定日期和时间:
        LocalDate d2 = LocalDate.of(2019, 11, 30); // 2019-11-30, 注意11=11月
        LocalTime t2 = LocalTime.of(15, 16, 17); // 15:16:17
        LocalDateTime dt2 = LocalDateTime.of(2019, 11, 30, 15, 16, 17);
        LocalDateTime dt3 = LocalDateTime.of(d2, t2);

        System.out.println("==================");

        // 自定义格式化:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        // 用自定义格式解析:
        LocalDateTime dt4 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(dt4);

        System.out.println("===================");

        LocalDateTime dt5 = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        System.out.println(dt5);
        // 加5天减3小时:
        LocalDateTime dt6 = dt5.plusDays(5).minusHours(3);
        System.out.println(dt6); // 2019-10-31T17:30:59
        // 减1月:
        LocalDateTime dt7 = dt6.minusMonths(1);
        System.out.println(dt7); // 2019-09-30T17:30:59


        // 本月第一天0:00时刻:
        LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();
        System.out.println(firstDay);

        // 本月最后1天:
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDay);

        // 下月第1天:
        LocalDate nextMonthFirstDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(nextMonthFirstDay);

        // 本月第1个周一:
        LocalDate firstWeekday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstWeekday);

        System.out.println("============");

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime target = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        System.out.println(now.isBefore(target));
        System.out.println(LocalDate.now().isBefore(LocalDate.of(2019, 11, 19)));
        System.out.println(LocalTime.now().isAfter(LocalTime.parse("08:15:00")));

        System.out.println("===============");

        LocalDateTime start = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        LocalDateTime end = LocalDateTime.of(2020, 1, 9, 19, 25, 30);
        Duration d3 = Duration.between(start, end);
        System.out.println(d3); // PT1235H10M30S

        Period p = LocalDate.of(2019, 11, 19).until(LocalDate.of(2020, 1, 9));
        System.out.println(p); // P1M21D


    }
}
