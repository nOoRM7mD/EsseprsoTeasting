package com.example.lenovo.esseprsoteasting;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by lenovo on 3/5/2018.
 */
public class MainActivityTest {
private String name="nourhaelkholy333@gmail.com";
    @Rule
   public ActivityTestRule<MainActivity> activityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);


    @Test
    public void testUser(){
        //get text
        Espresso.onView(withId(R.id.edit_text)).perform(typeText(name));
        //close soft keyboard
        Espresso.closeSoftKeyboard();
        //perform btn click
        Espresso.onView(withId(R.id.button)).perform(click());
        //checking the text in the text view
        Espresso.onView(withId(R.id.text_view)).check(matches(withText(name)));
}
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}