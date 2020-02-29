package com.alkathirikhalid.reddittopics.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alkathirikhalid.reddittopics.R;
import com.alkathirikhalid.reddittopics.data.TopicData;
import com.alkathirikhalid.reddittopics.model.Topic;
import com.google.android.material.textview.MaterialTextView;

public class ViewTopicActivity extends AppCompatActivity {
    public static String VIEW_TOP_BY_POSITION = "VIEW_TOP_BY_POSITION";
    private Topic topic;
    private MaterialTextView topicName, upVote, downVote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_topic);
        // Get the Topic index
        topic = TopicData.getAHomeTopic(getIntent().getIntExtra(VIEW_TOP_BY_POSITION, 0));

        topicName = findViewById(R.id.tvtopicName);
        upVote = findViewById(R.id.tvupVote);
        downVote = findViewById(R.id.tvdownVote);
        // Set the UI with Topic Data
        topicName.setText(topic.getName());
        upVote.setText(String.valueOf(topic.getUpVote()));
        downVote.setText(String.valueOf(topic.getDownVote()));
    }
}
