package org.example;
import java.util.HashMap;
import java.util.Scanner;

public class SportActivity {
    HashMap<String, Double> activities = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    String[] options = {"Add activity", "Print activities", "Exit"};

    public void addActivity(String name, double hoursSpent) {
        activities.put(name, hoursSpent);
    }

    public void printActivities() {
        double totalHours = 0;
        for (String key : activities.keySet()) {
            totalHours += activities.get(key);
            System.out.println(key + ": " + "Hours spent: " + activities.get(key));
        }
        System.out.println("Total hours spent: " + totalHours);
    }

    public void readInput() {
        int choice = 0;
        while (choice != 3) {
            System.out.println("Choose an option: ");
            for (int i = 0; i < options.length; i++) {
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
                    printActivities();
                    break;
                case 3:
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
