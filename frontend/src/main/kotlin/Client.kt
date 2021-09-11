import kotlinx.html.div
import kotlinx.html.dom.append
import org.w3c.dom.Node
import kotlinx.browser.window
import presenter.ClientPresenter

fun main() {
//    window.onload = { document.body?.sayHello() }

    window.onload = {

        val clientPresenter = ClientPresenter()
        val clientPage = ClientPage(clientPresenter)
        clientPage.show()
    }


}

fun Node.sayHello() {
    append {
        div {
            +"Hello from JS"
        }
    }
}