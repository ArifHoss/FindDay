package JavaDateAndTime;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write month,day,year to find that day!");

        System.out.print("Month: ");
        int month = sc.nextInt();
        sc.nextLine();

        System.out.print("Day: ");
        int day = sc.nextInt();
        sc.nextLine();

        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine();


        String res = Result.findDay(month, day, year);

        System.out.println(res);
    }
}
