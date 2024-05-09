package com.euclidiana.dimensions.web.controller;

import com.euclidiana.dimensions.persistence.entity.TablaAEntity;
import com.euclidiana.dimensions.service.TablaAService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/eucidiana")
public class TablaAController {
    public final TablaAService tablaAService;

    public TablaAController(TablaAService tablaAService) {
        this.tablaAService = tablaAService;
    }

    @GetMapping("/tablaA")
    public ResponseEntity<List<TablaAEntity>> getAll(){
        return ResponseEntity.ok(this.tablaAService.getAll());
    }
}
