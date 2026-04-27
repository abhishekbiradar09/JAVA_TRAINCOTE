package Day5;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Zonetimes {

    static void showDateTime(String zoneId) {
        ZoneId zone = ZoneId.of(zoneId);
        ZonedDateTime zdt = ZonedDateTime.now(zone);

        System.out.println("Current Date and Time in " + zoneId + ":");
        System.out.println(zdt);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Zone:");
        System.out.println("1.America/New_York");
        System.out.println("2.Europe/London");
        System.out.println("3.Asia/Tokyo");
        System.out.println("4.US/Pacific");
        System.out.println("5.Africa/Cairo");
        System.out.println("6.Australia/Sydney");
        int choice = sc.nextInt();

        String zoneId = "";

        if (choice == 1) {
            zoneId = "Asia/Kolkata";
        } 
        else if (choice == 2) {
            zoneId = "America/New_York";
        } 
        else if (choice == 3) {
            zoneId = "Europe/London";
        } 
        else if (choice == 4) {
            zoneId = "Asia/Tokyo";
        } 
        else if (choice == 5) {
            zoneId = "US/Pacific";
        } 
        else if (choice == 6) {
            zoneId = "Africa/Cairo";
        } 
        else if (choice == 7) {
            zoneId = "Australia/Sydney";
        } 
        else {
            System.out.println("Invalid choice");
            return;
        }
        showDateTime(zoneId);
    }
}