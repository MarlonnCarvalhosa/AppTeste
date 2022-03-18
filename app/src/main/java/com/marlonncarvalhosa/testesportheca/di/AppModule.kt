package com.marlonncarvalhosa.testesportheca.di

import com.marlonncarvalhosa.testesportheca.data.Apifactory
import com.marlonncarvalhosa.testesportheca.data.repository.PlayerRepository
import com.marlonncarvalhosa.testesportheca.data.repository.PlayerRepositoryImpl
import com.marlonncarvalhosa.testesportheca.data.service.PlayersService
import com.marlonncarvalhosa.testesportheca.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module{
    viewModel{
        MainViewModel(repository = get())
    }
}
val repositoryModule = module{
    single<PlayerRepository> {
        PlayerRepositoryImpl(apiPlayer = get())
    }
}
val serviceModule = module{
    single {
        Apifactory.create(PlayersService::class.java)
    }
}

val listModules = listOf(serviceModule, repositoryModule, viewModelModule)