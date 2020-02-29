package com.alkathirikhalid.reddittopics.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alkathirikhalid.reddittopics.R;
import com.alkathirikhalid.reddittopics.adaptor.HomeTopicsRecycleViewAdaptor;
import com.alkathirikhalid.reddittopics.data.TopicData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements HomeTopicsRecycleViewAdaptor.TopicListener {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private CreateTopicDialogFragment createTopicDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        recyclerView = findViewById(R.id.rvTopics);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new HomeTopicsRecycleViewAdaptor(this);
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createTopicDialogFragment = CreateTopicDialogFragment.newInstance();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                Fragment prev = getSupportFragmentManager().findFragmentByTag(getString(R.string.create_topic_dialog_fragment_tag));
                if (prev != null) {
                    fragmentTransaction.remove(prev);
                }
                fragmentTransaction.add(createTopicDialogFragment, getString(R.string.create_topic_dialog_fragment_tag));
                fragmentTransaction.commitAllowingStateLoss();
            }
        });
    }

    void updateHomeScreen() {
        // adapter.notifyDataSetChanged();
        adapter.notifyItemInserted(TopicData.size());
        if (TopicData.size() > 20) {
            Toast.makeText(this, getString(R.string.saved_maximum_viewable_topics_20), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemClicked(int position) {
        // TODO allow navigation to another screen to view topic
    }
}
