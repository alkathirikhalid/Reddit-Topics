package com.alkathirikhalid.reddittopics.data;

import com.alkathirikhalid.reddittopics.model.Topic;
import com.alkathirikhalid.reddittopics.util.TopicSorter;

import java.util.ArrayList;
import java.util.List;

/**
 * Data to function as storage in memory, with CRUD functions
 * <p>
 * Created by Al-Kathiri Khalid on 2/29/2020.
 * Reddit Topics.
 */
public class TopicData {
    private static List<Topic> topics = new ArrayList<>();

    /*
     * Global functions, Assuming for this app we will only allow Create, Read, Update
     * and No Deletion (No Requirement) but functionally possible as added below
     */
    public static List<Topic> getTopics() {
        return topics;
    }

    public static void setTopics(List<Topic> topics) {
        TopicData.topics = topics;
    }

    public static void clearTopics() {
        topics.clear();
    }

    public static void addATopic(Topic topic) {
        topics.add(topic);
    }

    public static void updateATopic(int index, Topic topic) {
        topics.set(index, topic);
    }

    public static Topic getATopic(int index) {
        return topics.get(index);
    }

    public static void removeATopic(int index) {
        topics.remove(index);
    }

    public static int size() {
        return topics.size();
    }

    /*
     * Home Screen functions that only require 20 topics from list
     */
    public static int homeSize() {
        return getHomePageTopics().size();
    }

    public static Topic getAHomeTopic(int index) {
        return getHomePageTopics().get(index);
    }

    public static void sortDecending() {
        topics.sort(new TopicSorter());
    }

    private static List<Topic> getHomePageTopics() {
        sortDecending();
        if (size() >= 20) {
            return topics.subList(0, 20);
        } else if (size() == 0) {
            return topics.subList(0, 0);
        } else {
            return topics.subList(0, (size()));
        }
    }
}