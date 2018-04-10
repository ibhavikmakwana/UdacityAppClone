package com.ibhavikmakwana.udacityappclone.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ibhavikmakwana.udacityappclone.R;


/**
 * Created by Bhavik Makwana on 30-03-2018.
 */
public class freeAdapter extends RecyclerView.Adapter<freeAdapter.ViewHolder> {

    public freeAdapter(Context context) {
        Context context1 = context;
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_free_courses, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View itemView) {
            super(itemView);
        }
    }
}