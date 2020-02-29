package com.alkathirikhalid.reddittopics.view;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.alkathirikhalid.reddittopics.R;
import com.alkathirikhalid.reddittopics.data.TopicData;
import com.alkathirikhalid.reddittopics.model.Topic;
import com.alkathirikhalid.reddittopics.util.TopicValidator;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/**
 * Created by Al-Kathiri Khalid on 2/29/2020.
 * Reddit Topics.
 */
public class CreateTopicDialogFragment extends DialogFragment {
    private MaterialButton btCreateTopic;
    private TextInputLayout tILTopicName;
    private TextInputEditText tIETTopicName;

    static CreateTopicDialogFragment newInstance() {
        return new CreateTopicDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_fragment_create_topic, container, false);
        btCreateTopic = view.findViewById(R.id.btCreateTopic);
        tILTopicName = view.findViewById(R.id.tILTopicName);
        tIETTopicName = view.findViewById(R.id.tIETTopicName);

        showKeyboard();

        btCreateTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String never null empty 0
                if (TopicValidator.inValidTopicName(tIETTopicName.getText().toString())) {
                    tILTopicName.setError(getString(R.string.topic_name_requirement_error));
                } else {
                    tILTopicName.setError(null);
                    Topic topic = new Topic(tIETTopicName.getText().toString());
                    TopicData.addATopic(topic);
                    // never null part of the screen
                    ((MainActivity) getActivity()).updateHomeScreen();
                    closeKeyboard();
                    dismiss();
                }
            }
        });

        return view;
    }

    private void showKeyboard() {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        } catch (NullPointerException e) {
            Log.e(getClass().getName(), e.getMessage());
        }

    }

    private void closeKeyboard() {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
        } catch (NullPointerException e) {
            Log.e(getClass().getName(), e.getMessage());
        }

    }
}