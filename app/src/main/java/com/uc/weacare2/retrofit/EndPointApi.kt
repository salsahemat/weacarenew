package com.uc.weacare2.retrofit
import org.json.JSONObject
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface EndPointApi {

//@POST("/login")
//suspend fun  loginUser(
//    @Body loginDetails: LoginDetail
//):Response<ApiResponse<LoginResponse>>
    @GET("/donation")
    //suspend fun : untk sebuah fungsi yang harus menunggu proses2 lain dan mengembalikan sebuah respond
    suspend fun getDonation(apiKey: String, language: String, page: Int): Response<JSONObject>
// data yang dikembalikan dlm bentuk donation

//    @GET("movie/{id}")
    //suspend fun : untk sebuah fungsi yang harus menunggu proses2 lain dan mengembalikan sebuah respond
//    suspend fun getMovieDetails(
//        @Path("id") id: Int,
//        @Query("api_key") apiKey: String
//    ):Response<MovieDetails>
//data yang dikembalikan dlm bentuk now playing

}

