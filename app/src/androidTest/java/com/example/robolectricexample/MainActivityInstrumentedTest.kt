package com.example.robolectricexample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.core.AllOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivity_btnCounter_buttonIsVisible() {
        onView(withId(R.id.btn_increase_counter))
            .check(matches(isDisplayed()))
    }

    @Test
    fun mainActivity_counterTextView_defaultContentIsDisplayed() {
        onView(
            AllOf.allOf(
                withId(R.id.tv_counter), ViewMatchers.withText("0")
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun mainActivity_counterTextView_oneIsDisplayed() {
        onView(withId(R.id.btn_increase_counter))
            .check(matches(isDisplayed()))
            .perform(ViewActions.click())
        onView(
            AllOf.allOf(
                withId(R.id.tv_counter), ViewMatchers.withText("1")
            )
        ).check(matches(isDisplayed()))
    }

    @Test
    fun mainActivity_counterTextView_fiveIsDisplayed() {
        repeat((1..5).count()) {
            onView(withId(R.id.btn_increase_counter))
                .check(matches(isDisplayed()))
                .perform(ViewActions.click())
        }
        onView(
            AllOf.allOf(
                withId(R.id.tv_counter), ViewMatchers.withText("5")
            )
        ).check(matches(isDisplayed()))
    }
}