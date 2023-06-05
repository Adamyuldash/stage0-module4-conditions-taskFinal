package school.mjc.stage0.conditions.finalTask;

import java.util.HashMap;

public class DaysInMonth {
    public void printDays(int year, int month) {
        HashMap<Integer, Integer> daysInMonth = new HashMap<>();
        daysInMonth.put(1, 31);
        daysInMonth.put(2, isLeapYear(year) ? 29 : 28);
        daysInMonth.put(3, 31);
        daysInMonth.put(4, 30);
        daysInMonth.put(5, 31);
        daysInMonth.put(6, 30);
        daysInMonth.put(7, 31);
        daysInMonth.put(8, 31);
        daysInMonth.put(9, 30);
        daysInMonth.put(10, 31);
        daysInMonth.put(11, 30);
        daysInMonth.put(12, 31);
        int days = daysInMonth.get(month);
        if (year < 0 || days == year) {
            System.out.println("Invalid year");
        } else {
            System.out.println(days);
        }
    }
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
