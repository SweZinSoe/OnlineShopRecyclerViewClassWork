package com.szs.recyclerviewonlineshopclasswork.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewonlineshopclasswork.R
import com.szs.recyclerviewonlineshopclasswork.model.NewProduct

class NewProductsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var categoryName = itemView.findViewById<TextView>(R.id.product_name)
    var countryCode = itemView.findViewById<TextView>(R.id.product_code)
    var categoryImage = itemView.findViewById<ImageView>(R.id.new_product_image)
}

class NewProductsAdapter(var newProductLists: ArrayList<NewProduct>) : RecyclerView.Adapter<NewProductsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewProductsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.new_products, parent, false)
        return NewProductsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newProductLists.size
    }

    override fun onBindViewHolder(holder: NewProductsViewHolder, position: Int) {
        holder.categoryName.text = newProductLists[position].categoryName
        holder.countryCode.text = newProductLists[position].countryCode
        holder.categoryImage.setImageResource(newProductLists[position].categoryImage)
    }

}