import components.buildClient
import contract.ClientContract
import entites.Client
import kotlinx.browser.document
import org.w3c.dom.HTMLDivElement

class ClientPage(private val presenter: ClientContract.Presenter) : ClientContract.View {

    private val loader = document.getElementById("loader") as HTMLDivElement



    override fun showCLients(clients: List<Client>) {
        buildClient(clients)
    }

    fun show() {
        presenter.attach(this)
        presenter.loadClients()
    }

    override fun showLoader() {
        loader.style.visibility = "visible"
    }
    override fun hideLoader() {
        loader.style.visibility = "hidden"
        loader.style.display = "none"
    }
}

