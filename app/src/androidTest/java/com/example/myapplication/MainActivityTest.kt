package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val username = "login"
    private val password = "12345"

    @Test
    @Throws(Exception::class)
    fun clickLoginButton() {
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_login)).perform(click())
        onView(withId(R.id.tv_login)).check(matches(isDisplayed()))
        onView(withId(R.id.et_username)).perform(ViewActions.typeText(username))
        onView(withId(R.id.et_password)).perform(ViewActions.typeText(password))
        onView(withId(R.id.btn_submit)).perform(click())
        onView(withId(R.id.tv_login)).check(matches(withText("Success")))
    }

}





