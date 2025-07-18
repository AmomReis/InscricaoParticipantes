package com.uepa.GerenciadorDeInscricoes.controller;

import com.uepa.GerenciadorDeInscricoes.model.Participante;
import com.uepa.GerenciadorDeInscricoes.repository.ParticipanteRepository;
import com.uepa.GerenciadorDeInscricoes.service.ParticipanteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ParticipanteController {

    @Autowired
    private ParticipanteServices service;

    @Autowired
    private ParticipanteRepository repository;

    // Exibe o formulário
    @GetMapping("/inscricao")
    public String mostrarFormulario(Model model) {
        model.addAttribute("participante", new Participante());
        return "forms";
    }

    // Processa os dados enviados
    @PostMapping("/inscricao")
    public String salvarParticipante(@ModelAttribute Participante obj, Model model) {
        if (repository.count() >= 30) {
            obj.setEmEspera(true);
            service.salvarParticipante(obj);
            model.addAttribute("mensagem", "Você foi colocado na lista de espera.");
            return "warningPage";
        }
        service.salvarParticipante(obj);
        model.addAttribute("mensagem", "Inscrição realizada com sucesso!");
        return "sucessPage";
    }
}
