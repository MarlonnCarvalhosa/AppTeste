package com.marlonncarvalhosa.testesportheca.data.service

import com.marlonncarvalhosa.testesportheca.data.response.DataResponse
import com.marlonncarvalhosa.testesportheca.data.response.PlayerResponse
import retrofit2.http.GET

interface PlayersService {

    @GET("/teste/teste.json")
    suspend fun getPlayers(): DataResponse

}