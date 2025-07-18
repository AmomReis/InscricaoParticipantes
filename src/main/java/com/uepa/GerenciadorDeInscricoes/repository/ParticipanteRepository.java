package com.uepa.GerenciadorDeInscricoes.repository;

import com.uepa.GerenciadorDeInscricoes.model.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
}
