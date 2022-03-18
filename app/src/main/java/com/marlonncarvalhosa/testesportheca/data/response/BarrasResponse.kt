package com.marlonncarvalhosa.testesportheca.data.response

import com.google.gson.annotations.SerializedName

data class BarrasResponse(

    @SerializedName("Copas_do_Mundo_Disputadas")
    val copasDoMundoDisputadas: CopasDoMundoDisputadasResponse?,

    @SerializedName("Copas_do_Mundo_Vencidas")
    val copasDoMundoVencidas: CopasDoMundoVencidasResponse?
)