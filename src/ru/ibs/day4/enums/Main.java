package ru.ibs.day4.enums;

public class Main {
    public static void main(String[] args) {
        Weekday weekday = Weekday.THURSDAY;
        workWithWeekday(weekday);
        workWithWeekday(Weekday.SUNDAY);

        // No enum constant ru.ibs.day4.enums.Weekday.Monday
        //System.out.println(Weekday.valueOf("Monday"));
        System.out.println(Weekday.valueOf("MONDAY"));
        System.out.println(weekday.isWeekend());
        System.out.println(Weekday.SATURDAY.isWeekend());

        Weekday.TUESDAY.print();
        A a = Weekday.WEDNESDAY;
        a.print();
    }

    public static void workWithWeekday(Weekday day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Working day");
        }
    }
}
