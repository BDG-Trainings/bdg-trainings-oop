package com.bdg.agalayan.lessons_07;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(day<31){
            this.day = day;
        }if (month<12) {
            this.month = month;
        }
        this.year = year;
    }


    public int getDay() {
        return day;

       }


    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public void setMonth(int month) {
        if(month<12){
        this.month = month;}

    }



    public void setDay(int day) {
        if(day<31) {
            this.day = day;
        }
        }

    public void setYear(int year) {
        this.year = year;
    }



    public void setDate(int day, int month, int year){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public String toString(){
        String amsativ = " "+day;
        if (day<9){
            amsativ="0"+day;
        }String amis = " "+ month;
        if(month<9){
            amis= "0"+month;
        }else{
            this.day=day;
            this.month=month;}
        return "dd/mm/yyyy" +"="+ amsativ+ "/" + amis+ "/"+ year;

    }
    public static void main(String [] args){
        Date date = new Date(100, 3, 2014);
        System.out.print(date.getMonth());
    }

}
