package com.bridgelabz;

import java.time.LocalDate;
import java.util.*;

import static jdk.jfr.internal.consumer.EventLog.update;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            System.out.println(" Press\n 1 ->  Retrieve data\n 2 -> Update Address,city,state,zip  by srNo\n " +
                    "3 Retrieve data for particular date" +
                    "-> \n 4 -> exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    retrieveData();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    reteriveDataForParticularDate();
                    break;
                case 4:
                    exit = true;
            }
        }
    }

    private static void reteriveDataForParticularDate() {
    }

    private static void retrieveData() {
    }
}
