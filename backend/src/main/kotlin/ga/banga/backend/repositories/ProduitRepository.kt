package ga.banga.backend.repositories

import ga.banga.backend.entities.Produit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProduitRepository : JpaRepository<Produit, Long>