package com.szs.recyclerviewonlineshopclasswork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewonlineshopclasswork.Adapter.*
import com.szs.recyclerviewonlineshopclasswork.model.NewProduct
import com.szs.recyclerviewonlineshopclasswork.model.ChooseCountry
import com.szs.recyclerviewonlineshopclasswork.model.LatestArrivals
import com.szs.recyclerviewonlineshopclasswork.model.PopularProducts

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newProductsView()
        latestArrivalsView()
        chooseCountryView()
        popularProductView()
    }

    fun newProductsView(){
        var newProductsRecycler: RecyclerView = findViewById(R.id.recycler_new_product)

        var newProductsLists = ArrayList<NewProduct>()
        newProductsLists.add(NewProduct("Camera", "New Product from American", R.drawable.camera))
        newProductsLists.add(NewProduct("Hat", "New Product from South Korea", R.drawable.hat))
        newProductsLists.add(NewProduct("Shoe", "New Product form Japan", R.drawable.shoe))

        var newProductAdapter = NewProductsAdapter(newProductsLists)

        newProductsRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        newProductsRecycler.adapter = newProductAdapter

    }

    fun latestArrivalsView(){
        var latestArrivalsRecycler: RecyclerView = findViewById(R.id.recycler_latest_arrivals)

        var latestArrivalLists = ArrayList<LatestArrivals>()
        latestArrivalLists.add(LatestArrivals("Hyde Park \nN41015", "LOUIS VUITTON", R.drawable.bag, 4.0, 500000.0, "560000 Ks"))
        latestArrivalLists.add(LatestArrivals("HORNS GRAY \nT SHIRT", "Lady Gaga", R.drawable.shirt, 3.5, 1000000.0, ""))
        latestArrivalLists.add(LatestArrivals("ROMA \n", "PUMA", R.drawable.shoe, 5.0, 400000.0, "500000 Ks"))
        latestArrivalLists.add(LatestArrivals("Poplin and cady \nmini skirt", "VICTORIA BECKHAM", R.drawable.skirt,4.5, 30000.0, ""))

        var latestArrivalAdapter = LatestArrivalsAdapter(latestArrivalLists)

        latestArrivalsRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        latestArrivalsRecycler.adapter = latestArrivalAdapter
    }

    fun chooseCountryView(){
        var chooseCountryRecycler: RecyclerView= findViewById(R.id.recycler_choose_country)

        var chooseCountryLists = ArrayList<ChooseCountry>()
        chooseCountryLists.add(ChooseCountry("Japan", R.drawable.japan))
        chooseCountryLists.add(ChooseCountry("Myanmar", R.drawable.myanmar))
        chooseCountryLists.add(ChooseCountry("China", R.drawable.china))
        chooseCountryLists.add(ChooseCountry("International",R.drawable.international))

        var chooseCountryAdapter = ChooseCountryAdapter(chooseCountryLists)

        chooseCountryRecycler.layoutManager = GridLayoutManager(this, 2)

        chooseCountryRecycler.adapter = chooseCountryAdapter
    }

    fun popularProductView(){
        var popularProductRecycler: RecyclerView = findViewById(R.id.recycler_popular_products)

        var popularProductLists = ArrayList<PopularProducts>()
        popularProductLists.add(PopularProducts("Iphone 8 Plus", "Apple", R.drawable.iphon, 980000.0, 3.5, "990000.0 Ks", "New", "30%"))
        popularProductLists.add(PopularProducts("GhostBed 11 Inch Cooling \nGel Memory Foam....", "GhostBed", R.drawable.goastbed,500000.0, 4.0, "600000 Ks", "0", "0"))
        popularProductLists.add(PopularProducts("BELAROI Womens Comfy \nSwing Tunic Short", "Belaroi", R.drawable.belaroi, 8000.0,5.0, "", "New", "35%"))

        var popularProductAdapter = PopularProductsAdapter(popularProductLists)

        popularProductRecycler.layoutManager = LinearLayoutManager(this)

        popularProductRecycler.adapter = popularProductAdapter
    }

}
