package com.alkathirikhalid.reddittopics.adaptor;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alkathirikhalid.reddittopics.R;
import com.alkathirikhalid.reddittopics.data.TopicData;
import com.alkathirikhalid.reddittopics.model.Topic;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/**
 * Home Screen Adaptor to allow 20 topics to be viewed
 * <p>
 * Created by Al-Kathiri Khalid on 2/29/2020.
 * Reddit Topics.
 */
public class HomeTopicsRecycleViewAdaptor extends RecyclerView.Adapter<HomeTopicsRecycleViewAdaptor.TopicRecycleViewHolder> {
    private TopicListener topicListener;
    // Selected list item on screen
    private int selectedItem = -1;

    public HomeTopicsRecycleViewAdaptor(TopicListener topicListener) {
        this.topicListener = topicListener;
    }

    @NonNull
    @Override
    public HomeTopicsRecycleViewAdaptor.TopicRecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topic, parent, false);
        return new TopicRecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeTopicsRecycleViewAdaptor.TopicRecycleViewHolder holder, int position) {
        // Populate with Home data List
        holder.mTVTopicName.setText(TopicData.getAHomeTopic(position).getName());
        holder.mTVTopicUpVote.setText(TopicData.getAHomeTopic(position).getUpVote().toString());
        holder.mTVTopicDownVote.setText(TopicData.getAHomeTopic(position).getDownVote().toString());
        // Allow Holder background toggle for item selected for navigation
        if (position == selectedItem) {
            holder.itemView.setBackgroundColor(Color.GREEN);
        } else {
            holder.itemView.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    @Override
    public int getItemCount() {
        // Return home screen data size
        return TopicData.homeSize();
    }

    public interface TopicListener {
        void onItemClicked(int position);
    }

    class TopicRecycleViewHolder extends RecyclerView.ViewHolder {
        MaterialTextView mTVTopicName, mTVTopicUpVote, mTVTopicDownVote;
        MaterialButton mBTopicUpVote, mBTopicDownVote;

        private TopicRecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            mTVTopicName = itemView.findViewById(R.id.mTVTopicName);
            mTVTopicUpVote = itemView.findViewById(R.id.mTVTopicUpVote);
            mTVTopicDownVote = itemView.findViewById(R.id.mTVTopicDownVote);
            mBTopicUpVote = itemView.findViewById(R.id.mBTopicUpVote);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    topicListener.onItemClicked(getAdapterPosition());
                    selectedItem = getAdapterPosition();
                    // When the view is clicked we need to trigger back ground drawing on new item
                    notifyDataSetChanged();//notifyItemChanged(getAdapterPosition());
                }
            });
            mBTopicUpVote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Topic topic = TopicData.getATopic(getAdapterPosition());
                    topic.upVote();
                    TopicData.updateATopic(getAdapterPosition(), topic);
                    selectedItem = -1;
                    // Up vote must trigger whole data set change to allow sorting
                    notifyDataSetChanged();
                }
            });
            mBTopicDownVote = itemView.findViewById(R.id.mBTopicDownVote);
            mBTopicDownVote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Topic topic = TopicData.getATopic(getAdapterPosition());
                    topic.downVote();
                    TopicData.updateATopic(getAdapterPosition(), topic);
                    selectedItem = -1;
                    // Not required for sorting but need to remove item selected background
                    notifyDataSetChanged();//notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}