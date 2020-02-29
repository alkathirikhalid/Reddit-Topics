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
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TopicVoteAndViewTest {

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
    public void topicVoteAndViewTest() {
        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textinput_error), withText("Topic name must be 1 to 255 characters"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("Topic name must be 1 to 255 characters")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.textinput_error), withText("Topic name must be 1 to 255 characters"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView2.check(matches(withText("Topic name must be 1 to 255 characters")));

        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText.perform(click());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText2.perform(replaceText("maths"), closeSoftKeyboard());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction floatingActionButton2 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton2.perform(click());

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText3.perform(replaceText("history"), closeSoftKeyboard());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction floatingActionButton3 = onView(
                allOf(withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        floatingActionButton3.perform(click());

        ViewInteraction textInputEditText4 = onView(
                allOf(withId(R.id.tIETTopicName),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tILTopicName),
                                        0),
                                0),
                        isDisplayed()));
        textInputEditText4.perform(replaceText("physics"), closeSoftKeyboard());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.btCreateTopic), withText("Create"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.mBTopicUpVote), withText("Up Vote"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.rvTopics),
                                        2),
                                1),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.mTVTopicName), withText("physics"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.rvTopics),
                                        0),
                                0),
                        isDisplayed()));
        textView3.check(matches(withText("physics")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.mTVTopicUpVote), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.rvTopics),
                                        0),
                                2),
                        isDisplayed()));
        textView4.check(matches(withText("1")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.mTVTopicUpVote), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.rvTopics),
                                        0),
                                2),
                        isDisplayed()));
        textView5.check(matches(withText("1")));

        ViewInteraction linearLayout = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.rvTopics),
                                childAtPosition(
                                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                        0)),
                        1),
                        isDisplayed()));
        linearLayout.perform(click());

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.tvtopicName), withText("maths"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        textView6.check(matches(withText("maths")));

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.tvupVote), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        textView7.check(matches(withText("0")));

        ViewInteraction textView8 = onView(
                allOf(withId(R.id.tvdownVote), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView8.check(matches(withText("0")));

        ViewInteraction textView9 = onView(
                allOf(withId(R.id.tvdownVote), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        textView9.check(matches(withText("0")));
    }
}
