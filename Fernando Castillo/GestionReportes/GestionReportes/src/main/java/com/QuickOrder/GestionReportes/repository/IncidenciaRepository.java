package com.QuickOrder.GestionReportes.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.QuickOrder.GestionReportes.model.Incidencia;

@Repository
public class IncidenciaRepository {

    //Lista
    private ArrayList<Incidencia> listaIncidencias = new ArrayList<>();
    
    //Contador para id autoincrementable
    private Long contador = 1L;

    //funcion para obtener la lista
    public ArrayList<Incidencia> getListaIncidencias(){
        return listaIncidencias;
    }

    //funcion para obtener pedidos segun su id
    public Incidencia getPedidosId(Long i){
        for(Incidencia inc : listaIncidencias){
            if(i == inc.getId()){
                return inc;
            }
        }
        return null;
    }

    //funcion para id autoincremental y crear una incidencia
    public Incidencia registrarPedidos(Incidencia inc){
        inc.setId(contador++);
        listaIncidencias.add(inc);
        return inc;
    }

    //funcion para actualizar
    public String actualizarPedido( Long id, Incidencia incidencia) {
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

    //funcion para borrar
    public String borrarPedido(Long id){
        for (Incidencia incidencia : listaIncidencias){
            if (incidencia.getId() == id){
                listaIncidencias.remove(incidencia);
                return "Pedido Eliminado";
            }
        }
        return "Pedido No encontrado";
    }

    //funcion para obtener segun su estado
    public Incidencia getIncidenciaEstado(Incidencia inc){
        for (Incidencia incidencia : listaIncidencias){
            if (inc.getEstado() == incidencia.getEstado()){
                return incidencia;
            }
        }
        return null;
    }

}
