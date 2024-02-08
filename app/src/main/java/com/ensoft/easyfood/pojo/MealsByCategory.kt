package com.ensoft.easyfood.pojo

import com.google.gson.annotations.SerializedName

data class MealsByCategory(

	@field:SerializedName("strMealThumb")
	val strMealThumb: String? = null,

	@field:SerializedName("idMeal")
	val idMeal: String? = null,

	@field:SerializedName("strMeal")
	val strMeal: String? = null
)