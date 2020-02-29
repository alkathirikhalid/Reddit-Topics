package com.alkathirikhalid.reddittopics.model;

/**
 * Created by Al-Kathiri Khalid on 2/29/2020.
 * Reddit Topics.
 */
public class Topic {

    private String name;
    private Integer upVote;
    private Integer downVote;

    public Topic(String name) {
        this.name = name;
        this.upVote = 0;
        this.downVote = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUpVote() {
        return upVote;
    }

    public void setUpVote(Integer upVote) {
        this.upVote = upVote;
    }

    public Integer getDownVote() {
        return downVote;
    }

    public void setDownVote(Integer downVote) {
        this.downVote = downVote;
    }

    public void upVote() {
        upVote++;
    }

    public void downVote() {
        downVote++;
    }
}
