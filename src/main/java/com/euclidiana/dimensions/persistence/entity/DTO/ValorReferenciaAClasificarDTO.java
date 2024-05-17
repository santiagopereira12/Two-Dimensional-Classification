package com.euclidiana.dimensions.persistence.entity.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValorReferenciaAClasificarDTO {
    private Integer valorX;
    private Integer valorY;

    public Integer getValorX() {
        return valorX;
    }

    public void setValorX(Integer valorX) {
        this.valorX = valorX;
    }

    public Integer getValorY() {
        return valorY;
    }

    public void setValorY(Integer valorY) {
        this.valorY = valorY;
    }
}
