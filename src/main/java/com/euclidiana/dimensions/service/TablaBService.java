package com.euclidiana.dimensions.service;

import com.euclidiana.dimensions.persistence.entity.TablaBEntity;
import com.euclidiana.dimensions.persistence.repository.TablaBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TablaBService {
    private final TablaBRepository tablaBRepository;

    @Autowired
    public TablaBService(TablaBRepository tablaBRepository) {
        this.tablaBRepository = tablaBRepository;
    }

    public List<TablaBEntity> getAll(){
        return this.tablaBRepository.findAll();
    }

    public TablaBEntity save(TablaBEntity tablaB){
        return this.tablaBRepository.save(tablaB);
    }

    public boolean exist(Long idTablaB){
        return this.tablaBRepository.existsById(idTablaB);
    }
}
