package com.example.tpb5nayo.viewModel

import com.example.tpb5nayo.model.ForecastModel
import com.example.tpb5nayo.model.WeatherModel
import com.example.tpb5nayo.network.RemoteDataSource
import com.example.tpb5nayo.network.RemoteDataSourceImpl
import org.json.JSONObject
import retrofit2.Response

class WeatherRepository {
    private val retrofitRemoteDataSource: RemoteDataSource = RemoteDataSourceImpl()
    fun getWeatherInfo(
        jsonObject: JSONObject,
        onResponse: (Response<WeatherModel>) -> Unit,
        onFailure: (Throwable) -> Unit,
    ) {
        retrofitRemoteDataSource.getWeatherInfo(jsonObject, onResponse, onFailure)
    }

    fun getForecastInfo(
        jsonObject: JSONObject,
        onResponse: (Response<ForecastModel>) -> Unit,
        onFailure: (Throwable) -> Unit,
    ) {
        retrofitRemoteDataSource.getForecastInfo(jsonObject, onResponse, onFailure)
    }
}