package com.euclidiana.dimensions.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tabla_b")
public class TablaBEntity {
    @Id
    @Column(name = "id_b")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTablaB;
    @Column(name = "column_x")
    private Integer x;
    @Column(name = "column_y")
    private Integer y;
    @Column(name = "obs_b")
    private String observacion;

}
