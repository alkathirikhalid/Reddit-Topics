package com.alkathirikhalid.reddittopics.view;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.alkathirikhalid.reddittopics.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TopicsCreationTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }

    @Test
    public void topicsCreationTest() {
        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction floatingActionButton2 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton2.perform(click());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(replaceText("2"), closeSoftKeyboard());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction floatingActionButton3 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton3.perform(click());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("3"), closeSoftKeyboard());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction floatingActionButton4 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton4.perform(click());

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText4.perform(replaceText("4"), closeSoftKeyboard());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction floatingActionButton5 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton5.perform(click());

        ViewInteraction textInputEditText5 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText5.perform(replaceText("5"), closeSoftKeyboard());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction floatingActionButton6 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton6.perform(click());

        ViewInteraction textInputEditText6 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText6.perform(replaceText("6"), closeSoftKeyboard());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton6.perform(click());

        ViewInteraction floatingActionButton7 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton7.perform(click());

        ViewInteraction textInputEditText7 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText7.perform(replaceText("7"), closeSoftKeyboard());

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton7.perform(click());

        ViewInteraction floatingActionButton8 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton8.perform(click());

        ViewInteraction textInputEditText8 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText8.perform(replaceText("8"), closeSoftKeyboard());

        ViewInteraction materialButton8 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton8.perform(click());

        ViewInteraction floatingActionButton9 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton9.perform(click());

        ViewInteraction textInputEditText9 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText9.perform(replaceText("9"), closeSoftKeyboard());

        ViewInteraction materialButton9 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton9.perform(click());

        ViewInteraction floatingActionButton10 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton10.perform(click());

        ViewInteraction textInputEditText10 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText10.perform(replaceText("10"), closeSoftKeyboard());

        ViewInteraction materialButton10 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton10.perform(click());

        ViewInteraction floatingActionButton11 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton11.perform(click());

        ViewInteraction textInputEditText11 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText11.perform(replaceText("11"), closeSoftKeyboard());

        ViewInteraction materialButton11 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton11.perform(click());

        ViewInteraction floatingActionButton12 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton12.perform(click());

        ViewInteraction textInputEditText12 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText12.perform(replaceText("12"), closeSoftKeyboard());

        ViewInteraction materialButton12 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton12.perform(click());

        ViewInteraction floatingActionButton13 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton13.perform(click());

        ViewInteraction textInputEditText13 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText13.perform(replaceText("13"), closeSoftKeyboard());

        ViewInteraction materialButton13 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton13.perform(click());

        ViewInteraction floatingActionButton14 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton14.perform(click());

        ViewInteraction textInputEditText14 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText14.perform(replaceText("14"), closeSoftKeyboard());

        ViewInteraction materialButton14 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton14.perform(click());

        ViewInteraction floatingActionButton15 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton15.perform(click());

        ViewInteraction textInputEditText15 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText15.perform(replaceText("15"), closeSoftKeyboard());

        ViewInteraction materialButton15 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton15.perform(click());

        ViewInteraction floatingActionButton16 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton16.perform(click());

        ViewInteraction textInputEditText16 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText16.perform(replaceText("16"), closeSoftKeyboard());

        ViewInteraction materialButton16 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton16.perform(click());

        ViewInteraction floatingActionButton17 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton17.perform(click());

        ViewInteraction textInputEditText17 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText17.perform(replaceText("17"), closeSoftKeyboard());

        ViewInteraction materialButton17 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton17.perform(click());

        ViewInteraction floatingActionButton18 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton18.perform(click());

        ViewInteraction textInputEditText18 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText18.perform(replaceText("18"), closeSoftKeyboard());

        ViewInteraction materialButton18 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton18.perform(click());

        ViewInteraction floatingActionButton19 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton19.perform(click());

        ViewInteraction textInputEditText19 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText19.perform(replaceText("19"), closeSoftKeyboard());

        ViewInteraction materialButton19 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton19.perform(click());

        ViewInteraction floatingActionButton20 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton20.perform(click());

        ViewInteraction textInputEditText20 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText20.perform(replaceText("20"), closeSoftKeyboard());

        ViewInteraction materialButton20 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton20.perform(click());

        ViewInteraction floatingActionButton21 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton21.perform(click());

        ViewInteraction textInputEditText21 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText21.perform(replaceText("21"), closeSoftKeyboard());

        ViewInteraction materialButton21 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton21.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.mTVTopicName), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.rvTopics),
                                        0),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("1")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.mTVTopicUpVote), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.rvTopics),
                                        0),
                                2),
                        isDisplayed()));
        textView2.check(matches(withText("0")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.mTVTopicDownVote), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.rvTopics),
                                        0),
                                4),
                        isDisplayed()));
        textView3.check(matches(withText("0")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.mTVTopicDownVote), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.rvTopics),
                                        0),
                                4),
                        isDisplayed()));
        textView4.check(matches(withText("0")));
    }
}
