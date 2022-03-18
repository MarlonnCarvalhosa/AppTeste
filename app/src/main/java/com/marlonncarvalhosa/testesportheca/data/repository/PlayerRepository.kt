package com.marlonncarvalhosa.testesportheca.data.repository

import com.marlonncarvalhosa.testesportheca.data.response.DataResponse
import com.marlonncarvalhosa.testesportheca.data.response.PlayerResponse
import kotlinx.coroutines.flow.Flow

interface PlayerRepository {
    suspend fun getPlayer(): Flow<DataResponse>
}