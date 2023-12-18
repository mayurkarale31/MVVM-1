package com.example.mvvm1

import java.util.Random


class InfoRepository {

    fun fetchInfo() : String{
        return "${Random().nextInt()}"
    }
}