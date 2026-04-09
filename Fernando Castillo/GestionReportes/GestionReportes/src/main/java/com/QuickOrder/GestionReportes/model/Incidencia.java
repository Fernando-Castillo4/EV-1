package com.QuickOrder.GestionReportes.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class Incidencia {

    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombreCompleto;

    @NotBlank(message = "La descripcion es obligatoria")
    private String descripcion;

    @NotBlank(message = "El estado es obligatorio")
    private Estado estado;

    @NotBlank(message = "El tipo del pedido es obligatorio")
    private TipoPedidos tipoPedido;

    @NotNull (message = "El monto es obligatorio")
    private double montoTotal;

    private LocalDate fechaPedido;

    public void setId(){
        this.id = id++;
    }

    public Long getId() {
        return id;
    }

    public @NotBlank(message = "El nombre es obligatorio") String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(@NotBlank(message = "El nombre es obligatorio") String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public @NotBlank(message = "La descripcion es obligatoria") String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(@NotBlank(message = "La descripcion es obligatoria") String descripcion) {
        this.descripcion = descripcion;
    }

    public @NotBlank(message = "El estado es obligatorio") Estado getEstado() {
        return estado;
    }

    public void setEstado(@NotBlank(message = "El estado es obligatorio") Estado estado) {
        this.estado = estado;
    }

    public @NotBlank(message = "El tipo del pedido es obligatorio") TipoPedidos getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(@NotBlank(message = "El tipo del pedido es obligatorio") TipoPedidos tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public @NotNull(message = "El monto es obligatorio") double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(@NotNull(message = "El monto es obligatorio") double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFechaPedido(){
        return fechaPedido;
    }
}
