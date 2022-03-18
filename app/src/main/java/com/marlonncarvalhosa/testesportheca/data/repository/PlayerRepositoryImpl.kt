package com.marlonncarvalhosa.testesportheca.data.repository

import android.util.Log
import com.marlonncarvalhosa.testesportheca.data.service.PlayersService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class PlayerRepositoryImpl(private val apiPlayer: PlayersService) : PlayerRepository {
    override suspend fun getPlayer() = flow {
        coroutineScope {
            try {
                val response = apiPlayer.getPlayers()
                emit(response)
            } catch (e: Exception){
                Log.d("ERROR", e.message.toString())
            }
        }
    }
}