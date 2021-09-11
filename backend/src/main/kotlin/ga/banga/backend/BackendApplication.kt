package ga.banga.backend

import ga.banga.backend.entities.Particulier
import ga.banga.backend.entities.Produit
import ga.banga.backend.entities.Societe
import ga.banga.backend.entities.Unite
import ga.banga.backend.metier.MetierImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BackendApplication : CommandLineRunner {
    @Autowired
    lateinit  var metier: MetierImpl

    override fun run(vararg args: String?) {
        metier.insertSociete(Societe(0,"CNSS", "Renovation", "contact@cnss.ga", "78451"))
        metier.insertParticulier(Particulier(0,"Romaric BANGA", "Akebe", "bangaromaric@gmail.ga"))
        metier.insertParticulier(Particulier(0,"Tanguy BANGA", "Akebe", "bangatanguy@gmail.ga"))
        metier.insertProduit(Produit(0,"PS5", Unite.MG, 20, 499000.0))
        metier.insertProduit(Produit(0,"XBOX Serie X", Unite.MG, 20, 399000.0))


    }
}

fun main(args: Array<String>) {
    runApplication<BackendApplication>(*args)
}
