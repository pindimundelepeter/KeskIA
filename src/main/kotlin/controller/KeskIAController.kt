package org.ldv.keskia.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class KesklAController {

    @GetMapping("/")
    fun home(model: Model): String {
        model.addAttribute("title", "Accueil - KeskIA")
        model.addAttribute("template", "exemple")
        return "base"
    }

    @GetMapping("/login")
    fun login(model: Model): String {
        model.addAttribute("title", "Connexion - KeskIA")
        model.addAttribute("template", "login")
        return "base"
    }
}
