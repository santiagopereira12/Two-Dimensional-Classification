package com.euclidiana.dimensions.service;

import com.euclidiana.dimensions.persistence.entity.TablaAEntity;
import com.euclidiana.dimensions.persistence.repository.TablaARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TablaAService {
    private final TablaARepository tablaARepository;

    @Autowired
    public TablaAService(TablaARepository tablaARepository) {
        this.tablaARepository = tablaARepository;
    }

    public List<TablaAEntity> getAll(){
        return this.tablaARepository.findAll();
    }
}
