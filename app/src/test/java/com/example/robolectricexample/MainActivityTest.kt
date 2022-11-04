package com.example.robolectricexample

import android.widget.TextView
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric.buildActivity
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    @Test
    fun mainActivity_counterTextView_defaultContentIsDisplayed() {
        val controller = buildActivity(MainActivity::class.java).setup()
        val textViewUnderTest = controller.get().findViewById<TextView>(R.id.tv_counter)
        assertThat(textViewUnderTest.text.toString()).isEqualTo("0")
    }

    @Test
    fun mainActivity_counterTextView_oneIsDisplayed() {
        val controller = buildActivity(MainActivity::class.java).setup()
        val increaseCounterButton = controller.get().findViewById<TextView>(R.id.btn_increase_counter)
        val textViewUnderTest = controller.get().findViewById<TextView>(R.id.tv_counter)

        increaseCounterButton.performClick()

        assertThat(textViewUnderTest.text.toString()).isEqualTo("1")
    }

    @Test
    fun mainActivity_counterTextView_fiveIsDisplayed() {
        val controller = buildActivity(MainActivity::class.java).setup()
        val increaseCounterButton = controller.get().findViewById<TextView>(R.id.btn_increase_counter)
        val textViewUnderTest = controller.get().findViewById<TextView>(R.id.tv_counter)

        repeat(5) {
            increaseCounterButton.performClick()
        }

        assertThat(textViewUnderTest.text.toString()).isEqualTo("5")
    }
}
