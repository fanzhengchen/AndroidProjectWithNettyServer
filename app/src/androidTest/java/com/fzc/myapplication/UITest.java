package com.fzc.myapplication;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;

/**
 * Created by fanzhengchen on 3/13/17.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class UITest {


    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<MainActivity>(
            MainActivity.class
    );

    @Test
    public void changeText() {

        onView(ViewMatchers.withId(R.id.sample_text))
                .perform(ViewActions.click())
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
