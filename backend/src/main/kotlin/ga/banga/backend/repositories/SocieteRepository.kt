package ga.banga.backend.repositories

import ga.banga.backend.entities.Societe
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SocieteRepository : JpaRepository<Societe, Long>