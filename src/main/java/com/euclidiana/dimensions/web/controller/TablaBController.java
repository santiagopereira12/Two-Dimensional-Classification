package com.euclidiana.dimensions.web.controller;

import com.euclidiana.dimensions.persistence.entity.TablaBEntity;
import com.euclidiana.dimensions.service.TablaBService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/tablaB")
    public ResponseEntity<TablaBEntity> add(@RequestBody TablaBEntity tablaB){
        if (tablaB != null){
            if (tablaB.getIdTablaB() != null && tablaBService.exist(tablaB.getIdTablaB())){
                TablaBEntity savedEntity = tablaBService.save(tablaB);
                return ResponseEntity.ok(savedEntity);
            }else {
                TablaBEntity newEntity = tablaBService.save(tablaB);
                return ResponseEntity.status(HttpStatus.CREATED).body(newEntity);
            }
        }else {
            return ResponseEntity.badRequest().build();
        }
    }
}
