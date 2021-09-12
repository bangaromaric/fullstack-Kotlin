package components

import entites.Client
import kotlinx.browser.document
import kotlinx.html.*
import kotlinx.html.dom.append
import utils.IMG_LBV_LIST
import kotlin.random.Random


fun buildClient(clients: List<Client>) {
    document.getElementById("root")?.append {

        div(classes = "row") {
            for (cli in clients) {
                val img = IMG_LBV_LIST[Random.nextInt(IMG_LBV_LIST.size)]
                div(classes = "col s12 m8 offset-m2 l6 offset-l3 ") {
                    div(classes = "card-panel grey lighten-5 z-depth-1 ") {
                        div(classes = "row valign-wrapper") {
                            div(classes = "col s3") {
                                img(src= img, alt="" ,classes= "circle responsive-img")
                            }
                            div(classes = "col s9") {
                                span(classes = "black-text") {
                                    strong {
                                        +"${cli.nom}"
                                    }
                                    br
                                    +"${cli.adresse}"
                                    br
                                }
                                span(classes = "black-text") {
                                    +"${cli.mail}"
                                }
                            }

                        }

                    }

                }

               /* div(classes = "col s6") {
                    div(classes = "card") {
                        div(classes = "card-image") {
                            img(src = "https://materializecss.com/images/sample-1.jpg")
                            span(classes = "card-title") {
                                +"Card Title"
                            }
                        }
                        div(classes = "card-content") {
                            p { +"I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively." }
                        }
                        div(classes = "card-action") {
                            a(href = null) {
                                +"This is a link"
                            }
                        }


                    }
                }

                */

            }


        }


//        div {
//            +"Hello from JS ARomaric ${client.size}"
//            ol {
//                for (p in client) {
//                    li {
//                        +p.nom
//                    }
//                }
//            }
//        }
    }

}