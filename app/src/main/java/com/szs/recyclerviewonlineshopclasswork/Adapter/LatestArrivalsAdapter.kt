package com.szs.recyclerviewonlineshopclasswork.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewonlineshopclasswork.R
import com.szs.recyclerviewonlineshopclasswork.model.LatestArrivals

class LatestArrivalViewholder(itemView: View): RecyclerView.ViewHolder(itemView){
    var categoryType = itemView.findViewById<TextView>(R.id.item_name)
    var categoryBrand = itemView.findViewById<TextView>(R.id.brand_name)
    var categoryImage = itemView.findViewById<ImageView>(R.id.latest_arrival_image)
    var ratingCount = itemView.findViewById<RatingBar>(R.id.rating_bar)
    var price = itemView.findViewById<TextView>(R.id.price)
}

class LatestArrivalsAdapter(var latestArrivalLists: ArrayList<LatestArrivals>) : RecyclerView.Adapter<LatestArrivalViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.latest_arrivals, parent, false)
        return LatestArrivalViewholder(view)
    }

    override fun getItemCount(): Int {
        return latestArrivalLists.size
    }

    override fun onBindViewHolder(holder: LatestArrivalViewholder, position: Int) {
        holder.categoryType.text = latestArrivalLists[position].categoryType
        holder.categoryBrand.text = latestArrivalLists[position].categoryBrand
        holder.categoryImage.setImageResource(latestArrivalLists[position].image)
        holder.ratingCount.rating = latestArrivalLists[position].ratingCount.toFloat()
        holder.price.text = latestArrivalLists[position].price.toDouble().toString()
    }

}