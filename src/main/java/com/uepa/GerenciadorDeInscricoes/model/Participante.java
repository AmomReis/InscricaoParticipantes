package com.uepa.GerenciadorDeInscricoes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O CPF é obrigatório")
    private String cpf;

    @Email(message = "E-mail inválido")
    @NotBlank(message = "O e-mail é obrigatório")
    private String email;

    private String fone;
    private String setor;
    private String nomeDaEmpresa;
    private boolean emEspera = false;

    // Construtor vazio (obrigatório para JPA)
    public Participante() {
    }

    // Construtor completo
    public Participante(String nome, String cpf, String email, String fone, String setor, String nomeDaEmpresa) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.fone = fone;
        this.setor = setor;
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFone() { return fone; }
    public void setFone(String fone) { this.fone = fone; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public String getNomeDaEmpresa() { return nomeDaEmpresa; }
    public void setNomeDaEmpresa(String nomeDaEmpresa) { this.nomeDaEmpresa = nomeDaEmpresa; }

    public boolean isEmEspera() {
        return emEspera;
    }

    public void setEmEspera(boolean emEspera) {
        this.emEspera = emEspera;
    }
}
