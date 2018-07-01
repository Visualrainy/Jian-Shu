package com.plugin.guild.data.api

import com.plugin.guild.data.user.entity.LoginRequest
import com.plugin.guild.domain.user.model.User
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RetrofitApi {
    companion object {
        val BASE_URL = "localhost:8080"
    }

    @POST("user/login")
    fun loginUser(@Body loginRequest: LoginRequest): Observable<String>

    @GET("user/{id}")
    fun user(@Path("id") userId: String): Observable<User>
}