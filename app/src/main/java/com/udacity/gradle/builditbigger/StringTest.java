package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.androidjoker.JokerActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class StringTest{

    @Rule
    public ActivityTestRule<JokerActivity> mActivityRule = new ActivityTestRule<>(
            JokerActivity.class);

    @Test
    public void test_EmptyString(){
        onView(withId(R.id.joke_tv)).check(matches(not(withText(""))));
    }

}
