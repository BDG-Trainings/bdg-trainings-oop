package Date;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner day = new Scanner(System.in);
        Scanner month = new Scanner(System.in);
        Scanner year = new Scanner(System.in);

        int d = day.nextInt();
        int m = month.nextInt();
        int y = year.nextInt();

        boolean isInputValid = true;

        if (d<1 || d>31){
            isInputValid = false;
            System.out.println("Please Enter a valid Day [1,31]");
        }
        if (m<1 || m>12){
            isInputValid = false;
            System.out.println("Please Enter a valid Month [1,12]");
        }
        if (y<1900 || y>9999){
            isInputValid = false;
            System.out.println("Please Enter a valid Year [1900,9999]");
        }

        if (isInputValid) {
            Date date = new Date(d, m, y);
            System.out.println(date.toString());
        } else {
            System.out.println("Pleas fix input values and try again.");
        }
    }
}
