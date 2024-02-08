package com.ensoft.easyfood.pojo

import com.google.gson.annotations.SerializedName

data class CategoryList(

	@field:SerializedName("categories")
	val categories: List<Category>
)