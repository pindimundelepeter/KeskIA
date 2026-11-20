package model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "fournisseur_ia")
class FournisseurIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var nom: String = "",

    @Column(name = "chemin_logo")
    var cheminLogo: String? = null,

    @Column(columnDefinition = "TEXT")
    var description: String? = null
)