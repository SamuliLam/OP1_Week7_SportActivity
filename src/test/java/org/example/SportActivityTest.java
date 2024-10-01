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
    public void testAddActivity() {
        sportActivity.addActivity("Running", 2.5);
        sportActivity.addActivity("Swimming", 1.5);
        assertEquals(2, sportActivity.activities.size());
    }

    @Test
    public void testRemoveActivity() {
        sportActivity.addActivity("Running", 2.5);
        sportActivity.addActivity("Swimming", 1.5);
        sportActivity.removeActivity("Running");
        assertEquals(1, sportActivity.activities.size());
    }

    @Test
    public void testPrintActivities() {
        sportActivity.addActivity("Running", 2.5);
        sportActivity.addActivity("Swimming", 1.5);
        sportActivity.printActivities();
    }

    @Test
    public void testHoursSpent() {
        sportActivity.addActivity("Running", 2.5);
        sportActivity.addActivity("Swimming", 1.5);
        assertEquals(4.0, sportActivity.getHoursSpent(), 0.0001);
    }
}