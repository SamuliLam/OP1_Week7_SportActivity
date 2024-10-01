package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SportActivityTest {

    private SportActivity sportActivity;

    @Before
    public void setUp() {
        sportActivity = new SportActivity();
    }

    @Test
    public void addActivity() {
        sportActivity.addActivity("Running", 2.5);
        sportActivity.addActivity("Swimming", 1.5);
        assertEquals(2, sportActivity.activities.size());
    }

    @Test
    public void printActivities() {
        sportActivity.addActivity("Running", 2.5);
        sportActivity.addActivity("Swimming", 1.5);
        sportActivity.printActivities();
    }

    @Test
    public void readInput() {
    }
}