package com.mml.student.controller;

import com.mml.student.models.EstudanteModel;
import com.mml.student.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/estudante")
public class EstudanteController {
    @Autowired
    private EstudanteService estudanteServices;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel){
        return estudanteServices.criarEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> listarEstudante(){
        return estudanteServices.findAll();
    }

    @GetMapping("/{id}")
    public Optional<EstudanteModel> buscarIdEstudante(@PathVariable Long id){
        return estudanteServices.buscarIdEstudante(id);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteServices.deletarEstudante(id);
    }
}
