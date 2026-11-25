package model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.time.LocalDateTime

@Entity
class ConversationIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var titre: String = "",
    var dateDerniereModification: LocalDateTime = LocalDateTime.now(),
    @OneToMany(mappedBy = "conversation")
    val messages: MutableList<MessageIA> = mutableListOf()
)