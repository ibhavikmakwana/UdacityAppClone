package com.ibhavikmakwana.udacityappclone.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ibhavikmakwana.udacityappclone.R


/**
 * Created by Bhavik Makwana on 30-03-2018.
 */
class NanodegreeAdapter(context: Context) : RecyclerView.Adapter<NanodegreeAdapter.ViewHolder>() {

    init {
        val context1 = context
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_free_courses, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}