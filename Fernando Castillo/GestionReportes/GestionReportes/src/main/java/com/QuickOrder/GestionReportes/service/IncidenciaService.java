package com.QuickOrder.GestionReportes.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuickOrder.GestionReportes.model.Incidencia;
import com.QuickOrder.GestionReportes.repository.IncidenciaRepository;

@Service
public class IncidenciaService {
    @Autowired
    private IncidenciaRepository incidenciaRepository;

    public ArrayList<Incidencia> getIncidencias(){return incidenciaRepository.getListaIncidencias();}

    public Incidencia getPedidosId(Long id){return incidenciaRepository.getPedidosId(id);}

    public Incidencia postPedido(Incidencia inc){return incidenciaRepository.registrarPedidos(inc);}

    public String updatePedido(Incidencia incidencia, Long id){return incidenciaRepository.actualizarPedido(incidencia, id);}

    public String deletePedido(Long id){return incidenciaRepository.borrarPedido(id);}

    public Incidencia getPedidosEstado(Incidencia inc){return incidenciaRepository.getIncidenciaEstado(inc);}
}
