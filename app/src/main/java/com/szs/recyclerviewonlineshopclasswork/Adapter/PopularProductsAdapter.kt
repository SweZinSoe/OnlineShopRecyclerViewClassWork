package com.szs.recyclerviewonlineshopclasswork.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewonlineshopclasswork.R
import com.szs.recyclerviewonlineshopclasswork.model.PopularProducts

class PopularProductsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var typeName = itemView.findViewById<TextView>(R.id.item_name)
    var brandName = itemView.findViewById<TextView>(R.id.brand_name)
    var price = itemView.findViewById<TextView>(R.id.price)
    var image = itemView.findViewById<ImageView>(R.id.item_image)
    var ratingCount = itemView.findViewById<RatingBar>(R.id.rating_bar)
    var strikeText = itemView.findViewById<TextView>(R.id.strike_price)
    var btnNew = itemView.findViewById<Button>(R.id.btn_new)
    var btnDiscount = itemView.findViewById<Button>(R.id.btn_discount)
}

class PopularProductsAdapter(var popularProductsLists: ArrayList<PopularProducts>) : RecyclerView.Adapter<PopularProductsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.popular_product, parent, false)
        return PopularProductsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularProductsLists.size
    }

    override fun onBindViewHolder(holder: PopularProductsViewHolder, position: Int) {
        holder.brandName.text = popularProductsLists[position].brandName
        holder.typeName.text = popularProductsLists[position].typeName
        holder.price.text = popularProductsLists[position].price.toString()
        holder.image.setImageResource(popularProductsLists[position].image)
        holder.ratingCount.rating = popularProductsLists[position].ratingCount.toFloat()
        holder.strikeText.text = popularProductsLists[position].strikePrice
        if (popularProductsLists[position].btnNew == "0"){
            holder.btnNew.visibility = View.INVISIBLE
        }

        if (popularProductsLists[position].btnDiscount == "0"){
            holder.btnDiscount.visibility = View.GONE
        }

    }

}