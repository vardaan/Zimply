package com.example.vardansharma.zimply.product;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vardansharma.zimply.R;
import com.example.vardansharma.zimply.base.BaseFragment;
import com.example.vardansharma.zimply.utils.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductFragment extends BaseFragment {


    @BindView (R.id.product_list_rv)
    RecyclerView productRv;
    @BindView (R.id.product_list_fab)
    FloatingActionButton fab;

    public ProductFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product, container, false);
        ButterKnife.bind(this, view);
        initUI();
        return view;
    }

    private void initUI() {
        final int space = (int) Utils.dpToPixel(16, getActivity());
        final int spanCount = 2;
        productRv.setLayoutManager(new GridLayoutManager(getActivity(), spanCount));
        productRv.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                final int position = parent.getChildAdapterPosition(view);
                if (position % spanCount == 0) {
                    outRect.left = space;
                    outRect.right = space / spanCount;
                }
                else {
                    outRect.left = space / spanCount;
                    outRect.right = space;
                }
                outRect.top = space;
            }
        });
        productRv.setAdapter(new ProductAdapter());
    }


}
