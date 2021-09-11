package ga.banga.backend.repositories

import ga.banga.backend.entities.Particulier
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ParticulierRepository : JpaRepository<Particulier, Long>