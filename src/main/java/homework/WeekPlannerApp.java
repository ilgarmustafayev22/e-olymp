package homework;

import java.util.Scanner;

public class WeekPlannerApp {
    public static void main(String[] args) {
        System.out.println("Please, input the day of the week: ");
        Scanner in = new Scanner(System.in);
        String week = in.next().toUpperCase();
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Listening to music";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "To take a walk";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "Go to job interview";
        schedule[5][0] = "Friday";
        schedule[5][1] = "Go to the gym";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "To rest";
        while (true) {
            if (schedule[0][0].toUpperCase().equals(week)) {
                System.out.println("Your tasks for Sunday:" + schedule[0][1]);
                break;
            } else if (schedule[1][0].toUpperCase().equals(week)) {
                System.out.println("Your tasks for Monday:" + schedule[1][1]);
                break;
            } else if (schedule[2][0].toUpperCase().equals(week)) {
                System.out.println("Your tasks for Tuesday:" + schedule[2][1]);
                break;
            } else if (schedule[3][0].toUpperCase().equals(week)) {
                System.out.println("Your tasks for Wednesday:" + schedule[3][1]);
                break;
            } else if (schedule[4][0].toUpperCase().equals(week)) {
                System.out.println("Your tasks for Thursday:" + schedule[4][1]);
                break;
            } else if (schedule[5][0].toUpperCase().equals(week)) {
                System.out.println("Your tasks for Friday:" + schedule[5][1]);
                break;
            } else if (schedule[6][0].toUpperCase().equals(week)) {
                System.out.println("Your tasks for Saturday:" + schedule[6][1]);
                break;
            } else {
                System.out.println("Sorry, I don't understand you, please try again.");
                break;
            }
        }
    }
}
