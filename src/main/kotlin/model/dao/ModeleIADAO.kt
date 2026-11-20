package model.dao

import model.entity.ModeleIA
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ModeleIADAO : JpaRepository<ModeleIA, Long>