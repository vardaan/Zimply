package com.example.vardansharma.zimply.stories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vardansharma.zimply.R;
import com.example.vardansharma.zimply.base.BaseFragment;


public class StoryFragment extends BaseFragment {

    public StoryFragment() {
        // Required empty public constructor
    }

    public static StoryFragment newInstance() {
        StoryFragment fragment = new StoryFragment();
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_story, container, false);
    }

}
