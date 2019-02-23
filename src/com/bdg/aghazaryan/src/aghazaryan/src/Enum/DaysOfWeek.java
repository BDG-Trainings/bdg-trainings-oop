package com.bdg.aghazaryan.src.aghazaryan.src.Enum;


public enum DaysOfWeek {

    MONDAY("first day", "Mondays are bad."),
    TUESDAY("second day", "Tuesdays are better."),
    WEDNESDAY("third day","Midweek days are so-so."),
    THURSDAY("fourth day", "Midweek days are so-so."),
    FRIDAY("fifth day", "Fridays are better."),
    SATURDAY("sixth day","Weekends are best."),
    SUNDAY("seventh day", "Weekends are best.");

    private final String num;
    private final String desc;

    DaysOfWeek (String description, String numberOfDays) {
        this.desc = description;
        this.num = numberOfDays;

    }

    public String getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }

    public static void main(String args[]) {
        for (DaysOfWeek WeekDays : DaysOfWeek.values())
            System.out.printf("%s \t%s\n", WeekDays, WeekDays.getDesc(), WeekDays.getNum());
    }
}
