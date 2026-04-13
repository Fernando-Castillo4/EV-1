package com.QuickOrder.GestionReportes.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Incidencia {

    //Datos utilizados en el codigo
    private Long id;

    //setter del ID
    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private String nombreCompleto;

    private String descripcion;

    private Estado estado;

    private TipoPedidos tipoPedido;

    private double montoTotal;


    //fecha genereada automaticamente
    private LocalDate fechaPedido = LocalDate.now();

    public LocalDate getFechaPedido(){
        return fechaPedido;
    }
}
