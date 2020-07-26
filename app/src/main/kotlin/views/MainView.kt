package application.view

import core.Core
import javafx.beans.value.ObservableValue
import javafx.geometry.Insets
import javafx.scene.control.TextInputControl
import javafx.scene.layout.Pane
import javafx.util.StringConverter
import tornadofx.* // ktlint-disable
import views.MyController
import java.text.Format

class MainView : View("MainView") {
    private val controller: MyController by inject()

    init {
        controller.run()
    }

    override val root = hbox {
        hbox {
            paddingAll = 10.0
            textfield("Hello world").addClass("title")
            textfield().bind(controller.stateProperty) { it.xid.toString() }
        }
    }
}

 fun TextInputControl.bind(property: ObservableValue<Core>,  converter: (Core)  -> String) =
    bindStringProperty(textProperty(),XConverter(converter), null, property, false)

class XConverter(val f: (Core) -> String) : StringConverter<Core>() {
    override fun toString(`object`: Core?) = `object`?.let { f(`object`) } ?: "N/A"

    override fun fromString(string: String?) = TODO()

}