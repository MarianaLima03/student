package com.mml.student.models;

import com.mml.student.enums.EstudanteEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String nome;
    private String email;
    @Column(name="age")
    private Integer idade;
    private EstudanteEnum estudanteEnum;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public EstudanteEnum getEstudanteEnum() {
        return estudanteEnum;
    }

    public void setEstudanteEnum(EstudanteEnum estudanteEnum) {
        this.estudanteEnum = estudanteEnum;
    }
}
