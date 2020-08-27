package com.tanveershafeeprottoy.daggerdemo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DemoResponse(
    @Json(name = "lastId")
    var lastId: Int = 0
)