package com.imaginarynationalpark.repository

import com.imaginarynationalpark.data.networking.ImaginaryNationalParkApi
import com.imaginarynationalpark.di.DaggerAppComponent
import javax.inject.Inject

class TourRepository {

    @Inject
    lateinit var imaginaryNationalParkApi: ImaginaryNationalParkApi

    init {
        DaggerAppComponent.create().inject(this)
    }

}