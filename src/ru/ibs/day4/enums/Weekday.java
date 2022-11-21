package ru.ibs.day4.enums;

public enum Weekday implements A{
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean isWeekend;

    Weekday(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    @Override
    public void print() {
        System.out.println(this + " is weekend? " + isWeekend);
    }
}
