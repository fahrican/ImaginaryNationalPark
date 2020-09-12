package com.imaginarynationalpark.data.networking

import com.imaginarynationalpark.model.AllToursResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

interface ImaginaryNationalParkApi {

    @Headers("Content-Type: application/json")
    @GET("v1/tours")
    fun getAllTours(): Single<AllToursResponse>

}