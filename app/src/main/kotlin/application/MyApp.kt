package application.app

import application.view.MainView
import tornadofx.*

class MyApp : App(MainView::class){
    init {
        importStylesheet("/css/style.css")
    }
}