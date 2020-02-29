package com.alkathirikhalid.reddittopics.util;

/**
 * To validate topic names
 * <p>
 * Created by Al-Kathiri Khalid on 2/29/2020.
 * Reddit Topics.
 */
public class TopicValidator {

    public static boolean inValidTopicName(String name) {
        return name.isEmpty() || name.length() > 255;

    }
}
