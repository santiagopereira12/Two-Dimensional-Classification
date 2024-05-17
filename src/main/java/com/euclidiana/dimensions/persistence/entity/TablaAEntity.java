package com.euclidiana.dimensions.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tabla_a")
public class TablaAEntity {
    @Id
    @Column(name = "id_a")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTablaA;
    @Column(name = "column_x")
    private Integer x;
    @Column(name = "column_y")
    private Integer y;
    @Column(name = "obs_a")
    private String observacion;

    public Long getIdTablaA() {
        return idTablaA;
    }

    public void setIdTablaA(Long idTablaA) {
        this.idTablaA = idTablaA;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
