package com.alkathirikhalid.reddittopics.util;

import com.alkathirikhalid.reddittopics.model.Topic;

import java.util.Comparator;

/**
 * To Sort topics based on up votes received
 * <p>
 * Created by Al-Kathiri Khalid on 2/29/2020.
 * Reddit Topics.
 */
public class TopicSorter implements Comparator<Topic> {

    @Override
    public int compare(Topic o1, Topic o2) {
        return o2.getUpVote().compareTo(o1.getUpVote());
    }
}

