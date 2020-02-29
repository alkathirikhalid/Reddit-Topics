package com.alkathirikhalid.reddittopics.data;

import com.alkathirikhalid.reddittopics.model.Topic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Al-Kathiri Khalid on 2/29/2020.
 * Reddit Topics.
 */
public class TopicData {
    private static List<Topic> topics = new ArrayList<>();

    public static List<Topic> getTopics() {
        return topics;
    }

    public static void setTopics(List<Topic> topics) {
        TopicData.topics = topics;
    }
}
