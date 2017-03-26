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
        final int space = (int) Utils.dpToPixel(16, getActivity());
        productRv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        productRv.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                final int position = parent.getChildAdapterPosition(view);
                if (position % 2 == 0) {
                    outRect.left = space;
                    outRect.right = space / 2;
                }
                else {
                    outRect.left = space / 2;
                    outRect.right = space;
                }
                outRect.top = space;
            }
        });
        productRv.setAdapter(new ProductAdapter());
        return view;
    }

    class ProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            final View view
                    = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
            return new ProductVH(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 100;
        }

        class ProductVH extends RecyclerView.ViewHolder {

            public ProductVH(View itemView) {
                super(itemView);
            }
        }
    }

}
