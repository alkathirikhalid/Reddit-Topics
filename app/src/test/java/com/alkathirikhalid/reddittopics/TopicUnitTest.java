package com.alkathirikhalid.reddittopics;

import com.alkathirikhalid.reddittopics.data.TopicData;
import com.alkathirikhalid.reddittopics.model.Topic;
import com.alkathirikhalid.reddittopics.util.TopicValidator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * App local unit test, which will execute on the development machine (host).
 *
 * <p>
 * Req 1 Maintain a list of topics and its upvotes/downvotes
 * Test for topic and topic list creation and manipulation validateTopic() & validateTopicList()
 *
 * <p>
 * Req 2 Allow the user to submit topics. For this challenge, a “topic” is simply a string that
 * does not exceed 255 characters.
 * Test for valid and invalid topics validateTopicLength()
 *
 * <p>
 * Req 3 Allow the user to upvote or downvote a topic. For this challenge, the user may up vote
 * or down vote the same topic multiple times.
 * Test for up votes and down votes validateTopicVotes()
 *
 * <p>
 * Req 4 Tapping a topic should expand that topic into a separate view (page)
 * To be done on Android Test
 *
 * <p>
 * Req 5 Always return a list of top 20 topics (sorted by upvotes, descending) on the homepage
 * Test for list size actual, homepage and sorting validateTopicData()
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TopicUnitTest {
    @Test
    public void validateTopic() {
        // Create a topic with a name topic
        Topic topic = new Topic("topic");
        // Test topic creation with all its 3 fields
        assertEquals(topic.getName(), "topic");
        assertSame(topic.getUpVote(), 0);
        assertSame(topic.getDownVote(), 0);
    }

    @Test
    public void validateTopicList() {
        // Create a topic with a name topic
        Topic topic = new Topic("topic");
        // Add the topic to topic data
        TopicData.addATopic(topic);
        // Test list creation with the topics
        assertSame(TopicData.getATopic(0), topic);
        assertEquals(TopicData.size(), 1);
        // Create a topic with a name new topic
        Topic newTopic = new Topic("new topic");
        // Add the new topic to topic data
        TopicData.addATopic(newTopic);
        // Test list with both topics
        assertEquals(TopicData.size(), 2);

        TopicData.clearTopics();
    }

    @Test
    public void validateTopicLength() {
        String invalidEmptyTopic = "";
        String validLengthTopic = "My valid topic is short";
        String validLengthTopic255 = "My valid topic is exactly 255 characters long My valid topic is exactly 255 characters long My valid topic is exactly 255 characters long My valid topic is exactly 255 characters long My valid topic is exactly 255 characters long My valid topic is exactly";
        String inValidLenghtTopic = "My invalid topic is exceeds 255 characters long My invalid topic is exceeds 255 characters long My invalid topic is exceeds 255 characters long My invalid topic is exceeds 255 characters long My invalid topic is exceeds 255 characters long My invalid topic is exceeds 255 characters long";
        // Test topic name
        assertTrue(TopicValidator.inValidTopicName(invalidEmptyTopic));
        assertFalse(TopicValidator.inValidTopicName(validLengthTopic));
        assertFalse(TopicValidator.inValidTopicName(validLengthTopic255));
        assertTrue(TopicValidator.inValidTopicName(inValidLenghtTopic));
    }

    @Test
    public void validateTopicVotes() {
        // Create a topic with a name topic
        Topic topic = new Topic("topic");
        // Up vote and down vote the topic
        topic.upVote(); // 1
        topic.downVote(); // 1
        // Add topic to data
        TopicData.addATopic(topic);
        // Test topic votes
        assertSame(TopicData.getATopic(0).getUpVote(), 1);
        assertSame(TopicData.getATopic(0).getDownVote(), 1);
        // Up vote and down vote the topic
        TopicData.getATopic(0).upVote(); // 2
        TopicData.getATopic(0).downVote(); // 2
        // Test topic votes
        assertSame(TopicData.getATopic(0).getUpVote(), 2);
        assertSame(TopicData.getATopic(0).getDownVote(), 2);

        TopicData.clearTopics();
    }

    @Test
    public void validateTopicData() {
        // Create a list of topics to a size of 30 with topic names 0-29
        for (int x = 0; x < 30; x++) {
            TopicData.addATopic(new Topic(String.valueOf(x)));
        }
        // Test actual data size
        assertEquals(TopicData.size(), 30);
        // Test home screen data size
        assertEquals(TopicData.homeSize(), 20);
        // up vote topic at index 10
        TopicData.getATopic(10).upVote();
        // Trigger sorting mimic home screen data retrieval
        TopicData.sortDecending();
        // Test topic at index 10 has been moved to index 0
        assertEquals(TopicData.getATopic(0).getName(), "10");
        // up vote topic at index 0
        TopicData.getATopic(0).upVote();
        TopicData.getATopic(0).upVote();
        // Trigger sorting mimic home screen data retrieval
        TopicData.sortDecending();
        // Test total votes at index 0
        assertSame(TopicData.getATopic(0).getUpVote(), 3);

        TopicData.clearTopics();
    }
}