package contract

import entites.Client


interface ClientContract {
    interface View {
        fun showCLients(clients: List<Client>)
        fun showLoader()
        fun hideLoader()
    }

    interface Presenter {
        fun attach(view: View)

        fun loadClients()


    }
}