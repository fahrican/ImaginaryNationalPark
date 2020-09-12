package com.imaginarynationalpark.di

import com.imaginarynationalpark.data.networking.ImaginaryNationalParkApi
import com.imaginarynationalpark.data.networking.ImaginaryNationalParkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
object AppModule {

    @Singleton
    @Provides
    fun provideApi(): ImaginaryNationalParkApi = ImaginaryNationalParkService.getClient()
}