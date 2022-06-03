package com.example.robolectricexample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.core.AllOf.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /*@Test
    fun mainActivity_btnCounter_buttonIsVisible() {
        val scenario = launchActivity<MainActivity>()
        scenario.onActivity {
            onView(withId(R.id.btn_increase_counter)).check(matches(isDisplayed()))
        }
    }

    @Test
    fun mainActivity_counterTextView_defaultContentIsDisplayed() {
        val scenario = launchActivity<MainActivity>()
        scenario.onActivity {
            onView(
                allOf(
                    withId(R.id.tv_counter), withText("0")
                )
            ).check(matches(isDisplayed()))
        }
    }

    @Test
    fun mainActivity_counterTextView_oneIsDisplayed() {
        val scenario = launchActivity<MainActivity>()
        scenario.onActivity {
            onView(withId(R.id.btn_increase_counter))
                .check(matches(isDisplayed()))
                .perform(click())
            onView(
                allOf(
                    withId(R.id.tv_counter), withText("1")
                )
            ).check(matches(isDisplayed()))
        }
    }

    @Test
    fun mainActivity_counterTextView_fiveIsDisplayed() {
        val scenario = launchActivity<MainActivity>()
        scenario.onActivity {
            repeat((1..5).count()) {
                onView(withId(R.id.btn_increase_counter))
                    .check(matches(isDisplayed()))
                    .perform(click())
            }
            onView(
                allOf(
                    withId(R.id.tv_counter), withText("5")
                )
            ).check(matches(isDisplayed()))
        }
    }*/

    @Test
    fun mainActivity_btnCounter_buttonIsVisible() {
        onView(withId(R.id.btn_increase_counter))
            .check(matches(isDisplayed()))
    }

    @Test
    fun mainActivity_counterTextView_defaultContentIsDisplayed() {
        onView(
            allOf(
                withId(R.id.tv_counter), withText("0")
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun mainActivity_counterTextView_oneIsDisplayed() {
        onView(withId(R.id.btn_increase_counter))
            .check(matches(isDisplayed()))
            .perform(click())
        onView(
            allOf(
                withId(R.id.tv_counter), withText("1")
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun mainActivity_counterTextView_fiveIsDisplayed() {
        repeat((1..5).count()) {
            onView(withId(R.id.btn_increase_counter))
                .check(matches(isDisplayed()))
                .perform(click())
        }
        onView(
            allOf(
                withId(R.id.tv_counter), withText("5")
            )
        ).check(matches(isDisplayed()))
    }
}
