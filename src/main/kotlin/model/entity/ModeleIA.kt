package model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "modele_ia")
class ModeleIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var nom: String = "",

    @Column(name = "url_api", nullable = false)
    var urlAPI: String = "",

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    @Column(name = "chemin_logo")
    var cheminLogo: String? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fournisseur_ia_id", nullable = false)
    var fournisseurIA: FournisseurIA
)