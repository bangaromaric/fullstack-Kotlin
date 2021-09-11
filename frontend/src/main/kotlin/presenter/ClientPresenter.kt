package presenter

import contract.ClientContract
import entites.Client
import org.w3c.xhr.XMLHttpRequest

class ClientPresenter : ClientContract.Presenter {

    private lateinit var view: ClientContract.View

    override fun attach(view: ClientContract.View) {
        this.view = view
    }


    override fun loadClients() {
        view.showLoader()

        getAsync("http://localhost:8089/api/clients") { response ->
            val clients = JSON.parse<Array<Client>>(response)
            view.hideLoader()
            view.showCLients(clients.toList())
        }
    }

    // 1
    private fun getAsync(url: String, callback: (String) -> Unit) {
        // 2
        val xmlHttp = XMLHttpRequest()
        // 3
        xmlHttp.open("GET", url)
        // 4
        xmlHttp.onload = {
            // 5
            if (xmlHttp.readyState == 4.toShort() && xmlHttp.status == 200.toShort()) {
                // 6
                callback.invoke(xmlHttp.responseText)
            }
        }
        // 7
        xmlHttp.send()
    }

}