package com.example.affirmations

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class AffirmationTest{

    @get: Rule()
    val activity: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun app_load_text_correct(){

    }

}