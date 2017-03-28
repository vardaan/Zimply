package com.example.vardansharma.zimply.product;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vardansharma.zimply.R;

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