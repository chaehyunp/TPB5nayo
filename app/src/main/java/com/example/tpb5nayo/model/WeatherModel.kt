package com.example.tpb5nayo.model

import com.google.gson.annotations.SerializedName

data class WeatherModel (
    @SerializedName("name")
    var name: String?,  //도시이름

    @SerializedName("weather")
    var weather: List<WeatherDetailModel>,

    @SerializedName("main")
    var main: WeatherDetailModel,

    @SerializedName("wind")
    var wind: WeatherDetailModel,

    @SerializedName("sys")
    var sys: WeatherDetailModel,

    @SerializedName("clouds")
    var clouds: WeatherDetailModel,

)

data class WeatherDetailModel (
    @SerializedName("main")
    var main: String?,  //날씨

    @SerializedName("description")
    var description: String?,  //상세 날씨 설명

    @SerializedName("icon")
    var icon: String?,  //날씨 이미지
)

data class WeatherMainModel(
    @SerializedName("temp")
    var temp: Double?,  //현재온도

    @SerializedName("humidity")
    var humidity: Double?,  //현재습도
)


data class WeatherWindModel(
    @SerializedName("speed")
    var speed: Double?,  //바람
)


data class WeatherSysModel(
    @SerializedName("country")
    var country: String?,  //나라
)


data class WeatherCloudsModel(
    @SerializedName("all")
    var all: Double?,  //구름
)