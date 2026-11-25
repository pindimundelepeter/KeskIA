package model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
class MessageIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var role: String = "",
    var contenu: String = "",
    var dateEnvoi: LocalDateTime = LocalDateTime.now(),
    @ManyToOne
    @JoinColumn(name = "conversation_id")
    var conversation: ConversationIA? = null
)