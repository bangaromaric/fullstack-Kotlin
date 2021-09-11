package ga.banga.backend.repositories

import ga.banga.backend.entities.Commande
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommandeRepository : JpaRepository<Commande, Long>