package com.example.vardansharma.zimply.product;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vardansharma.zimply.R;
import com.example.vardansharma.zimply.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductFragment extends BaseFragment {


    public ProductFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false);
    }

}
