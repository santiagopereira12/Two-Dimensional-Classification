package com.euclidiana.dimensions.web.controller;

import com.euclidiana.dimensions.persistence.entity.TablaBEntity;
import com.euclidiana.dimensions.service.TablaBService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/eucidiana")
public class TablaBController {
    private final TablaBService tablaBService;

    public TablaBController(TablaBService tablaBService) {
        this.tablaBService = tablaBService;
    }

    @RequestMapping("/tablaB")
    public ResponseEntity<List<TablaBEntity>> getAll(){
        return ResponseEntity.ok(this.tablaBService.getAll());
    }
}
