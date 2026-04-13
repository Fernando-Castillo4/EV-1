package com.QuickOrder.GestionReportes.repository;

import java.util.ArrayList;
import java.util.List;

import com.QuickOrder.GestionReportes.model.Incidencia;

import org.springframework.stereotype.Repository;

@Repository
public class IncidenciaRepository {

    private List<Incidencia> listaIncidencias = new ArrayList<>();

    public List<Incidencia> getListaIncidencias(){
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

    public String actualizarPedido(Incidencia incidencia) {
        for(Incidencia inc : listaIncidencias){
            if(inc.getId() == listaIncidencias.size()){
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


}
