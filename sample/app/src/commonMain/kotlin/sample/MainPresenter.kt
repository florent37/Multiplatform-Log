package sample

import com.github.florent37.log.Logger

interface MainView {
}

class MainPresenter {
    private val tag = "ErrorTag"
    private var view: MainView? = null

    fun bind(view: MainView){
        this.view = view
    }

    fun unbind(){
        this.view = null
    }

    fun testLambda(block: (String) -> Unit){

    }

    fun displayLogError(){
        Logger.e(tag, "my error message")
    }

    fun displayLogDebug(){
        Logger.d(tag, "my debug message")
    }

}