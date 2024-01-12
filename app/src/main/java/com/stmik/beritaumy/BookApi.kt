package com.stmik.beritaumy

import retrofit2.Response
import retrofit2.http.GET

interface BookApi {
    @GET("berita.json")
        suspend fun getBooks() : Response<List<Book>>

}