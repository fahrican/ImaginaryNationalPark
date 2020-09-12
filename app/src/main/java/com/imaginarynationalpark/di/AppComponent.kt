package com.imaginarynationalpark.di

import com.imaginarynationalpark.repository.TourRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(tourRepository: TourRepository)

}