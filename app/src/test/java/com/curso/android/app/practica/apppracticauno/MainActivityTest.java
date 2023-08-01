package com.curso.android.app.practica.apppracticauno;

import org.junit.Rule;
import org.junit.runner.RunWith;

public class MainActivityTest{
    @RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule activityScenarioRule = new ActivityScenarioRule(MainActivity.class);

    @Test
    public void testComparisonUI() {
        onView(withId(R.id.editTextNumber1)).perform(typeText("5"), closeSoftKeyboard());
        onView(withId(R.id.editTextNumber1)).perform(typeText("10"), closeSoftKeyboard());
        onView(withId(R.id.buttonCompare)).perform(click());

        onView(withId(R.id.textViewComparisonResult)).check(matches(withText("Número 2 es mayor que Número 1")));
    }
}
}
