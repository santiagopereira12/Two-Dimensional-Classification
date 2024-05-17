package com.euclidiana.dimensions.service;

import com.euclidiana.dimensions.persistence.entity.DTO.DatosOrdenados;
import com.euclidiana.dimensions.persistence.entity.DTO.ValorReferenciaAClasificarDTO;
import com.euclidiana.dimensions.persistence.entity.TablaAEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ClasificarServiceImpl implements ClasificarService{
    TablaAService tablaAService;

    public ClasificarServiceImpl(TablaAService tablaAService){
        this.tablaAService = tablaAService;
    }

    @Override
    public String retornarClasificacion(ValorReferenciaAClasificarDTO valorReferencia) {
        List<TablaAEntity> tablaA = tablaAService.getAll();
        List<DatosOrdenados> listaDatos = new ArrayList<>();
        formulaDatos(valorReferencia, tablaA, listaDatos);
        return clasificarDatos(valorReferencia, listaDatos);
    }

    private static void formulaDatos(ValorReferenciaAClasificarDTO valorReferencia, List<TablaAEntity> tablaA ,List<DatosOrdenados> listaDatos){
        for (TablaAEntity tablaA1 : tablaA){
            Double resultadoFormula = Math.pow(valorReferencia.getValorX() - tablaA1.getX(), 2) + Math.pow(valorReferencia.getValorY() - tablaA1.getY() , 2);
            Double raizCuadradaAbsoluta = Math.sqrt(Math.abs(resultadoFormula));
            DatosOrdenados datos = new DatosOrdenados();
            datos.setEtiqueta(tablaA1.getObservacion());
            datos.setRaiz(raizCuadradaAbsoluta);
            listaDatos.add(datos);
        }
    }

    private String clasificarDatos(ValorReferenciaAClasificarDTO valorReferencia, List<DatosOrdenados> listaDatos){
        Collections.sort(listaDatos, Comparator.comparingDouble(DatosOrdenados::getRaiz));
        listaDatos.forEach(datos -> System.out.println("Etiqueta: " + datos.getEtiqueta() + ", Raiz: " + datos.getRaiz()));
        int contadorBajos = 0;
        int contadorAltos = 0;
        for (int i = 0; i < 5 && i < listaDatos.size(); i++){
            DatosOrdenados datos = listaDatos.get(i);
            if ("Bajos".equals(datos.getEtiqueta())){
                contadorBajos++;
            } else if ("Altos".equals(datos.getEtiqueta())) {
                contadorAltos++;
            }
        }
        return clasificarDatoGuardarDatoDB(valorReferencia, contadorBajos, contadorAltos);
    }

    private String clasificarDatoGuardarDatoDB(ValorReferenciaAClasificarDTO valorReferencia, int contadorBajos, int contadorAltos){
        TablaAEntity datoNuevo = new TablaAEntity();
        datoNuevo.setX(valorReferencia.getValorX());
        datoNuevo.setY(valorReferencia.getValorY());
        if (contadorBajos > contadorBajos){
            datoNuevo.setObservacion("Bajos");
        }else if (contadorAltos > contadorBajos){
            datoNuevo.setObservacion("Altos");
        }else {
            return "Altos y Bajos son la misma cantidad, no se puede guardar el dato";
        }
        tablaAService.save(datoNuevo);
        return datoNuevo.getObservacion();
    }
}
