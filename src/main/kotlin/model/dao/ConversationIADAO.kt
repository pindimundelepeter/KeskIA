package model.dao

import model.entity.ConversationIA
import org.springframework.data.jpa.repository.JpaRepository

interface ConversationIADAO : JpaRepository<ConversationIA, Long> {
    fun findAllByOrderByDateDerniereModificationDesc(): List<ConversationIA>
}