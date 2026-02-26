package com.mml.student.services;

import com.mml.student.models.EstudanteModel;
import com.mml.student.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EstudanteService {
    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();
    }

    public Optional<EstudanteModel> buscarIdEstudante(Long id){
        return estudanteRepository.findById(id);
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }
}
