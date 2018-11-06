package com.github.kieuthang.login_chat.data.entity

import com.google.gson.annotations.SerializedName


class UserResponseModel : BaseResponseModel() {
    @SerializedName("id")
    var id: Int = 0
    @SerializedName("first_name")
    var firstName: String? = null
    @SerializedName("last_name")
    var lastName: String? = null
    @SerializedName("email")
    var email: String? = null
    @SerializedName("password")
    var password: String? = null
    @SerializedName("created")
    var created: Long = 0
    @SerializedName("isActive")
    var isActive: Boolean = true
    @SerializedName("isDeleted")
    var isDeleted: Boolean = false
}