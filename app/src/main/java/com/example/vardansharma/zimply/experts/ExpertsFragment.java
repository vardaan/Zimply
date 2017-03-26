package com.example.vardansharma.zimply.experts;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vardansharma.zimply.R;
import com.example.vardansharma.zimply.base.BaseFragment;


public class ExpertsFragment extends BaseFragment {


    public ExpertsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_experts, container, false);
    }

}
