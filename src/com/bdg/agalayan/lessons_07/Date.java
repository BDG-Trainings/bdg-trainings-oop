package Lessons_07;

public class Date {
    private int day;
    private int month;
    private int yaer;

    public Date(int day, int month, int yaer){
        this.day = day;
        this.month = month;
        this.yaer = yaer;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYaer(){
        return yaer;
    }
    public void SetDay(int day){
        this.day = day;
    }
    public void SetMonth(int month){
        this.month = month;
    }
    public void SetYear(int yaer){
        this.yaer = yaer;
    }public void SetDate(int day, int month, int yaer){
        this.day = day;
        this.month = month;
        this.yaer = yaer;
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
        return "dd/mm/yyyy" +"="+ amsativ+ "/" + amis+ "/"+ yaer
                ;

    }
    public static void main(String [] args){
        Date Mesrop = new Date(15, 3, 2014);
        System.out.print("Mesrop."+Mesrop.toString());
    }

}
