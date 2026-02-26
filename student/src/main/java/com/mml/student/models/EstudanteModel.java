package com.mml.student.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String nome;
    private String emai;
    @Column(name="age")
    private Integer idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
