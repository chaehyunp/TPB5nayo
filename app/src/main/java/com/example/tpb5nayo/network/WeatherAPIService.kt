package com.example.tpb5nayo.network

import com.example.tpb5nayo.model.ForecastModel
import com.example.tpb5nayo.model.WeatherModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherAPIService {
    @GET("data/2.5/{path}")
    fun doGetJsonDataWeather(
        @Path("path") path: String,
        @Query("q") q: String,
        @Query("appid") appid: String,
    ): Call<WeatherModel>

    @GET("data/2.5/{path}")
    fun doGetJsonDataForecast(
        @Path("path") path: String,
        @Query("id") id: String,
        @Query("appid") appid: String,
    ): Call<ForecastModel>
}