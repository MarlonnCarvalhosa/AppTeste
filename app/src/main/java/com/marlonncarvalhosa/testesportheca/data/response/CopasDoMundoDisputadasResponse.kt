package com.marlonncarvalhosa.testesportheca.data.response

import com.google.gson.annotations.SerializedName

data class CopasDoMundoDisputadasResponse(

    @SerializedName("max")
    val max: Double?,

    @SerializedName("pla")
    val pla: Double?,

    @SerializedName("pos")
    val pos: Int?
)