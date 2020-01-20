package com.szs.recyclerviewonlineshopclasswork.model

data class LatestArrivals(
    var categoryType: String,
    var categoryBrand: String,
    var image: Int,
    var ratingCount: Double,
    var price: Double,
    var strikePrice: String
)