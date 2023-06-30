package com.example.tpb5nayo.network

import com.example.tpb5nayo.model.ForecastModel
import com.example.tpb5nayo.model.WeatherModel
import org.json.JSONObject
import retrofit2.Response

interface RemoteDataSource {
    fun getWeatherInfo(
        jsonObject: JSONObject,
        onResponse: (Response<WeatherModel>) -> Unit,
        onFailure: (Throwable) -> Unit
    )

    fun getForecastInfo(
        jsonObject: JSONObject,
        onResponse: (Response<ForecastModel>) -> Unit,
        onFailure: (Throwable) -> Unit
    )
}