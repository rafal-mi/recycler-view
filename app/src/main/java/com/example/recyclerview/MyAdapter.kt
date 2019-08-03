package com.example.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class MyAdapter(private val myDataset: ArrayList<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(var v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            var message = "Clicked"
            Log.d(TAG, message)
        }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.MyViewHolder {
        // create a new view
        val rowView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item_row, parent, false) as View
        // set the view's size, margins, paddings and layout parameters
        return MyViewHolder(rowView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.v.textView.text = myDataset[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size

    companion object {
        const val TAG = MyApp.TAG

    }
}
