package com.bottlerunner.room_o_swap.data

import com.bottlerunner.room_o_swap.Request

data class UserApna(
var id: String = "",
var name: String = "",
var email: String = "",
var password:String ="",
var hostel:String="",
var roomNo:Int=0,
var requestList: MutableList<Request> = mutableListOf( Request("AH-4",123, mutableListOf(Pair("CH-5",
    IntRange(1,300)), Pair("CH-7",IntRange(1,300))),id,name))

)
