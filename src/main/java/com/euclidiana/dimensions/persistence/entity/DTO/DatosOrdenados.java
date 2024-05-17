package com.euclidiana.dimensions.persistence.entity.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatosOrdenados {
    private String etiqueta;
    private Double raiz;

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Double getRaiz() {
        return raiz;
    }

    public void setRaiz(Double raiz) {
        this.raiz = raiz;
    }
}
