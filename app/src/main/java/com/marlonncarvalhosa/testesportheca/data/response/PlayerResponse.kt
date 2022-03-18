package com.marlonncarvalhosa.testesportheca.data.response

import com.google.gson.annotations.SerializedName

data class PlayerResponse(

    @SerializedName("Barras")
    val barras: BarrasResponse?,

    @SerializedName("country")
    val country: String?,

    @SerializedName("img")
    val img: String?,

    @SerializedName("name")
    val name: String?,

    @SerializedName("percentual")
    val percentual: Double?,

    @SerializedName("pos")
    val pos: String?
)