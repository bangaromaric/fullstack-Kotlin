package components

import entites.Client
import kotlinx.browser.document
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.li
import kotlinx.html.ol
import org.w3c.dom.Node



fun buildClient(client: List<Client>){
    document.getElementById("root")?.append{
        div {
            +"Hello from JS ARomaric ${client.size}"
            ol {
                for (p in client) {
                    li {
                        +p.nom
                    }
                }
            }
        }
    }

}