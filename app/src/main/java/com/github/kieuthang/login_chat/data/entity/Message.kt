package com.github.kieuthang.login_chat.data.entity

class Message {
    var id: Long = 0
    var sentById: Long = 0
    var sentByName: String? = null
    var message: String? = null
    var sentOn: String? = null
    var sentByMe: Boolean = false
    var roomId: Long = 0
    var roomName: String? = null

    var type: Int = 0

    companion object {
        val TYPE_SERVER_CONNECT = 1
        val TYPE_LOADING_VIEW = 2
    }
}