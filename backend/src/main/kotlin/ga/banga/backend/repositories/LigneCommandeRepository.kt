package ga.banga.backend.repositories

import ga.banga.backend.entities.LigneCommands
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LigneCommandeRepository : JpaRepository<LigneCommands, Long>