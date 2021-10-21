package com.company;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class Application {


    public String mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to Los Angeles Classical.\n");
        System.out.println("Enter \"1\" to search for concerts");
        System.out.println("Enter \"2\" to submit a concert");
        System.out.println("");
        return scanner.nextLine();
    }

    public Application() {
    }

    public void getEventDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the event:");
        String eventName = scanner.nextLine();
        Event newEvent = new Event(eventName);

        System.out.println("Enter the performer or ensemble name:");
        String performer = scanner.nextLine();
        newEvent.setPerformer(performer);

        System.out.println("Enter event year:");
        System.out.println("Ex. \"yyyy\"");
        String year = scanner.nextLine();

        System.out.println("Enter month:");
        System.out.println("Ex. \"4\"");
        String month = scanner.nextLine();

        System.out.println("Enter day of the month:");
        System.out.println("Ex. \"17\"");
        String dayOfMonth = scanner.nextLine();

        System.out.println("Enter event hour");
        System.out.println("Ex. \"13\" (24 hour clock)");
        String hour = scanner.nextLine();

        System.out.println("Enter minutes:");
        System.out.println("Ex. \"30\"");
        String minute = scanner.nextLine();

        String timeZone = "-07:00";
        String dateAsString = year + "-" + month + "-" + dayOfMonth +
                "T" + hour + ":" + minute + ":00.000" + timeZone;
        ZonedDateTime date = ZonedDateTime.parse(dateAsString);
        newEvent.setDateAndTime(date);
        System.out.println(newEvent.toString());
    }
}
