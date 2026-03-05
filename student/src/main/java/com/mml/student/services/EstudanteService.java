package com.mml.student.services;

import com.mml.student.models.EstudanteModel;
import com.mml.student.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
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

     //public EstudanteModel buscaPoiD(Long id){
     //   return estudanteRepository.findById(id).get();
    //   }
    //   OUTRO JEITO DE FAZER O BUSCAR ID(JEITO ERRADO)

    public EstudanteModel atualizarEstudante(Long id, EstudanteModel estudanteModel){
        EstudanteModel model = estudanteRepository.findById(id).get();
        model.setNome(estudanteModel.getNome());
        model.setEmail(estudanteModel.getEmail());
        model.setIdade(estudanteModel.getIdade());
        return estudanteRepository.save(model);
    }
    //optional ele salva
}
