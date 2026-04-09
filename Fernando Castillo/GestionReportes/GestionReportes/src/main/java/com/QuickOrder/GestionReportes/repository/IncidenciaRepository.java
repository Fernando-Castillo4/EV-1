package com.QuickOrder.GestionReportes.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.QuickOrder.GestionReportes.model.Incidencia;

@Repository
public class IncidenciaRepository {
    private ArrayList<Incidencia> listaIncidencias = new ArrayList<>();

    public ArrayList<Incidencia> getListaIncidencias(){
        return listaIncidencias;
    }

    public Incidencia getPedidosId(Long id){
        for(Incidencia inc : listaIncidencias){
            if(inc.getId().equals(id)){
                return inc;
            }
        }
        return null;
    }

    public Incidencia registrarPedidos(Incidencia inc){
        listaIncidencias.add(inc);
        return inc;
    }

    public String actualizarPedido(Incidencia incidencia, Long id) {
        for(Incidencia inc : listaIncidencias){
            if(inc.getId() == id){
                inc.setNombreCompleto(incidencia.getNombreCompleto());
                inc.setDescripcion(incidencia.getDescripcion());
                inc.setEstado(incidencia.getEstado());
                inc.setTipoPedido(incidencia.getTipoPedido());
                inc.setMontoTotal(incidencia.getMontoTotal());

                return "Cambios ingresado de manera exitosa";
            }
        }
        return "No se pudieron realizar cambios";
    }

    public String borrarPedido(Long id){
        for (Incidencia incidencia : listaIncidencias){
            if (incidencia.getId() == id){
                listaIncidencias.remove(id);
                return "Pedido Eliminado";
            }
        }
        return "Pedido No encontrado";
    }

    public Incidencia getIncidenciaEstado(Incidencia inc){
        for (Incidencia incidencia : listaIncidencias){
            if (inc.getEstado() == incidencia.getEstado()){
                return incidencia;
            }
        }
        return null;
    }

}
