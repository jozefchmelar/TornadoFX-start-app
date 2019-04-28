package views

import core.Core
import javafx.beans.property.SimpleObjectProperty
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.javafx.JavaFx
import tornadofx.*
import kotlinx.coroutines.launch

class MyController : Controller() {
    private var myModel = Core()
    val stateProperty = SimpleObjectProperty(myModel)

    fun run() = GlobalScope.launch(Dispatchers.JavaFx) {
        while(true) {
            delay(1000)
            val new = myModel.copy(myModel.xid+1)
            myModel = new
            stateProperty.set(new)
        }
    }
}


