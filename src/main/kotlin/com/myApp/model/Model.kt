package com.myApp.model

import kotlinx.coroutines.experimental.channels.produce

data class DataModel(val test: Int)

class MyModel {
    private var x = 0
    val hello = produce {
        while (true) send(x++)
    }

}