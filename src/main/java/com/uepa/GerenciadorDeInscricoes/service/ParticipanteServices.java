package com.uepa.GerenciadorDeInscricoes.service;

import com.uepa.GerenciadorDeInscricoes.model.Participante;
import com.uepa.GerenciadorDeInscricoes.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipanteServices {

    @Autowired
    private ParticipanteRepository repository;

    public String salvarParticipante(Participante p) {
        if (repository.count() >= 30) {
            p.setEmEspera(true);
            repository.save(p);
            return "espera";
        } else {
            repository.save(p);
            return "sucesso";
        }
    }
}
