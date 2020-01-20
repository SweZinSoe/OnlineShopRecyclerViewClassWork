package com.szs.recyclerviewonlineshopclasswork.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewonlineshopclasswork.R
import com.szs.recyclerviewonlineshopclasswork.model.ChooseCountry

class chooseCountryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var country = itemView.findViewById<TextView>(R.id.country_name)
    var image = itemView.findViewById<ImageView>(R.id.country_image)
}

class ChooseCountryAdapter(var chooseCountryLists: ArrayList<ChooseCountry>) : RecyclerView.Adapter<chooseCountryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chooseCountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.choose_country, parent, false)
        return chooseCountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chooseCountryLists.size
    }

    override fun onBindViewHolder(holder: chooseCountryViewHolder, position: Int) {
        holder.country.text = chooseCountryLists[position].country
        holder.image.setImageResource(chooseCountryLists[position].image)
    }

}
