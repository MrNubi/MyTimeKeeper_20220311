package com.beyond.mytimekeeper_20220311.API

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerAPI {

    // Retrofit의 API클래스는 싱글턴

    companion object{
//        서버통신용 레트로핏 개체
        private var retrofit : Retrofit? = null
        private val Base_Url  = "https://keepthetime.xyz"
        fun getRetrofit():Retrofit{

//            레트로핏 라이브러리는 클래스 차원에서 베이스 url설정가능

            if (retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create()) // 레트로핏에 GSON라이브러리 접목
                    .build()
            }

            return retrofit!!

        }
    }

}