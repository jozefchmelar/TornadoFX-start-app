package com.myApp.view

import com.myApp.controller.MyController
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    private val myController: MyController by inject()

    override val root = vbox {
        label(myController.textProperty)
        myController.run()
        textfield { text = "live ui :)" }
    }
}