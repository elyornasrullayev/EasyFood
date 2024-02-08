package com.ensoft.easyfood.pojo

import com.google.gson.annotations.SerializedName

data class MealList(

	@field:SerializedName("meals")
	val meals: List<Meal>
)