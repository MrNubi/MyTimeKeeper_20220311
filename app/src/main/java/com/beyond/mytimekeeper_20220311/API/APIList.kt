package com.beyond.mytimekeeper_20220311.API

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface APIList {

    // BaseUrl 이 지시하는 서버에서, 어떤 기능들을 사용할 지 명시해놓는 곳

    @POST("/")
    fun postRequestLogin
                (@Field("email")email:String,
                 @Field("password")pw:String
    ) : Call<JsonObject>

}