package application.view

class MainView : View("MainView") {

  // private val controller: Controller by inject()

    override val root = vbox {
       label("Hello world")
    }


}