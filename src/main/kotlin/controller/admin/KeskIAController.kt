package org.ldv.keskia.controller

import model.dao.ConversationIADAO
import model.dao.MessageIADAO
import model.dao.ModeleIADAO
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.server.ResponseStatusException
import service.IAServiceFactory

@Controller
class KesklAController(
    private val iaServiceFactory: IAServiceFactory,
    private val conversationIADAO: ConversationIADAO,
    private val messageIADAO: MessageIADAO,
    private val modeleIADAO: ModeleIADAO
) {

    @GetMapping("/")
    fun home(model: Model): String {
        model.addAttribute("title", "Accueil - KeskIA")
        model.addAttribute("template", "exemple")
        model.addAttribute("conversation", null)
        model.addAttribute("modeles", modeleIADAO.findAll())
        model.addAttribute("conversations", conversationIADAO.findAllByOrderByDateDerniereModificationDesc())
        return "base"
    }

    @GetMapping("/login")
    fun login(model: Model): String {
        model.addAttribute("title", "Connexion - KeskIA")
        model.addAttribute("template", "login")
        return "base"
    }

    // 10.2 Créer une nouvelle conversation
    @PostMapping("/conversations")
    fun creerConversation(
        @RequestParam prompt: String,
        @RequestParam idModele: Long
    ): String {
        // Récupération du modèle sélectionné
        val modele = modeleIADAO.findById(idModele)
            .orElseThrow {
                ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Modèle IA introuvable"
                )
            }

        // La suite de la méthode (création de la conversation, appel IA, sauvegarde des messages et redirection) arrive sur la page suivante
        TODO("Compléter avec la suite de la section 10.2")
    }
}