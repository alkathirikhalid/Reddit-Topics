package com.alkathirikhalid.reddittopics.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.alkathirikhalid.reddittopics.R;
import com.alkathirikhalid.reddittopics.adaptor.HomeTopicsRecycleViewAdaptor;
import com.alkathirikhalid.reddittopics.model.Topic;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements HomeTopicsRecycleViewAdaptor.TopicListener {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// TODO allow topic creationg
            }
        });
    }

    @Override
    public void onItemClicked(int position, Topic topic) {
        // TODO allow navigation to another screen to view topic
    }
}
