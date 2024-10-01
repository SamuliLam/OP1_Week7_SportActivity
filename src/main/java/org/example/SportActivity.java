package org.example;
import java.util.HashMap;
import java.util.Scanner;

public class SportActivity {

    private double hoursSpent;
    HashMap<String, Double> activities;
    Scanner scanner;

    // Input options for the user to choose from
    String[] options = {"Add activity", "Remove activity", "Print activities", "Exit"};

    public SportActivity() {
        activities = new HashMap<>();
        scanner = new Scanner(System.in);
        hoursSpent = 0;
    }

    public void addActivity(String name, double activityHours) {
        activities.put(name, hoursSpent);
        hoursSpent += activityHours;
    }

    public void removeActivity(String name) {
        activities.remove(name);
    }

    public void printActivities() {
        for (String key : activities.keySet()) {
            System.out.println(key + ": " + "Hours spent: " + activities.get(key));
        }
        System.out.println("Total hours spent: " + hoursSpent);
    }

    public double getHoursSpent() {
        return hoursSpent;
    }

    public void readInput() {
        int choice = 0;
        // Loop until the user chooses number "3", which is to exit
        while (choice != 3) {
            System.out.println("Choose an option: ");
            for (int i = 0; i < options.length; i++) {
                // Print the options for the user to choose from, in format "(number). (option)"
                System.out.println((i + 1) + ". " + options[i]);
            }
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter activity name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter hours spent: ");
                    double hoursSpent = scanner.nextDouble();
                    addActivity(name, hoursSpent);
                    break;
                case 2:
                    System.out.println("Enter activity name: ");
                    String activityName = scanner.nextLine();
                    if (activities.containsKey(activityName)) {
                        removeActivity(activityName);
                        System.out.println("Activity removed");
                    } else {
                        System.out.println("Activity not found");
                    }
                    break;
                case 3:
                    printActivities();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }


    public static void main(String[] args) {
        SportActivity sportActivity = new SportActivity();
        sportActivity.readInput();
    }

}
