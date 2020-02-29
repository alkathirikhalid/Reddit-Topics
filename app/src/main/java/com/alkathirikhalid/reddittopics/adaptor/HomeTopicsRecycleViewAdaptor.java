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
        holder.mTVTopicName.setText(TopicData.getAHomeTopic(position).getName());
        holder.mTVTopicUpVote.setText(TopicData.getAHomeTopic(position).getUpVote().toString());
        holder.mTVTopicDownVote.setText(TopicData.getAHomeTopic(position).getDownVote().toString());

        if (position == selectedItem) {
            holder.itemView.setBackgroundColor(Color.GREEN);
        } else {
            holder.itemView.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    @Override
    public int getItemCount() {
        return TopicData.homeSize();
    }

    public interface TopicListener {
        void onItemClicked(int position, Topic topic);
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
                    topicListener.onItemClicked(getAdapterPosition(), TopicData.getAHomeTopic(getAdapterPosition()));
                    selectedItem = getAdapterPosition();
                    notifyDataSetChanged();
                    //notifyItemChanged(getAdapterPosition());
                }
            });
            mBTopicUpVote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Topic topic = TopicData.getATopic(getAdapterPosition());
                    topic.upVote();
                    TopicData.updateATopic(getAdapterPosition(), topic);
                    selectedItem = -1;
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
                    notifyDataSetChanged();
                    // notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}