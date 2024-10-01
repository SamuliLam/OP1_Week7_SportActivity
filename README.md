# Sport Activity Tracker

This is a simple Java console application that allows users to track time spent on various sports activities. Users can add, remove, and view activities, along with the total hours spent.

## Features

- **Add Activity**: Add a new sport activity with the number of hours spent.
- **Remove Activity**: Remove an existing activity from the list.
- **Print Activities**: View all recorded activities along with the hours spent on each, and the total time spent.
- **Exit**: Exit the application.

## How to Use the Application

### Prerequisites

- Java 17 or higher installed on your system.

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/SamuliLam/OP1_Week7_SportActivity.git

2. Navigate to the project directory:
   ```bash
   cd OP1_Week7_SportActivity

3. Compile the Java program:
    ```bash
    javac -d out src/org/example/SportActivity.java

4. Run the application:
    ```bash
    java -cp out org.example.SportActivity

### User options
Choose an option:
1. Add activity
2. Remove activity
3. Print activities
4. Exit

# Summary Report: Sport Activity Tracker

## Project Overview

The **Sport Activity Tracker** is a Java console application designed to help users log and manage the time spent on various sports activities. It allows users to add, remove, and view activities, along with tracking the total hours spent. The application interacts with the user via a simple menu-based system, providing intuitive options to manage their activity data.

## Features

1. **Add Activity**: Users can add new activities by providing the activity name and hours spent. The hours are then aggregated into a total hours count.
2. **Remove Activity**: Users can remove any previously added activity by providing its name.
3. **View Activities**: The application displays a list of all activities along with the respective hours spent. It also shows the cumulative total of hours spent on all activities.
4. **Exit**: Users can exit the application via the menu.

## Key Components

- **`SportActivity` Class**: The main class that encapsulates the functionality of the application.
  - `addActivity()`: Adds a new activity and updates the total hours spent.
  - `removeActivity()`: Removes an existing activity by name.
  - `printActivities()`: Displays the list of activities and total hours.
  - `readInput()`: Manages user input and interaction through a menu system.
  
- **Data Storage**: A `HashMap<String, Double>` is used to store activity names as keys and hours spent as values. The total hours spent on all activities is tracked by a class variable `hoursSpent`.

## Implementation Details

- **Input Handling**: User input is handled through a `Scanner` object. The program runs in a loop until the user chooses to exit.
- **Menu Options**: The program presents the user with four options: Add activity, Remove activity, Print activities, and Exit.
- **Error Handling**: Basic validation is performed for invalid menu choices and nonexistent activities during removal.

