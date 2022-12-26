package com.uc.weacare2.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uc.weacare2.R
import com.uc.weacare2.helper.Const
import com.uc.weacare2.model.Donation

class DonationAdapter(private val dataSet: List<Donation>) :
    RecyclerView.Adapter<DonationAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgset: ImageView

        init {
            // Define click listener for the ViewHolder's View.
            imgset = view.findViewById(R.id.imgcompay)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_listlogocompany, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
//        Glide.with(viewHolder.itemView).load(Const.IMG_URL + dataSet[position].logo_path)
//            .into(viewHolder.imgset)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}