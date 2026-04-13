package com.QuickOrder.GestionReportes.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QuickOrder.GestionReportes.model.Incidencia;
import com.QuickOrder.GestionReportes.service.IncidenciaService;


@RestController
@RequestMapping("/EV1/QuickOrder/pedidos")
public class IncidenciancidenciaController {
    
    //Metodo service junto para importar las funciones
    @Autowired
    private IncidenciaService service;

    @GetMapping
    public ArrayList<Incidencia> getListIncidencias(){return service.getIncidencias();}
    
    @GetMapping("/{id}")
    public Incidencia getPedidosId(@RequestBody Long i){return service.getPedidosId(i);}
    
    @PostMapping
    public Incidencia postIncidencia(@RequestBody Incidencia inc){return service.postPedido(inc);}
    
    @PutMapping("/{id}")
    public String updateIncidencia(@RequestBody Long id, @PathVariable Incidencia incidencia){return service.updatePedido(incidencia, id);}

    @DeleteMapping("/{id}")
    public String deletePedido(@PathVariable Long id){return service.deletePedido(id);}

    @GetMapping("/{inc}")
    public Incidencia getPedidosEstado(@PathVariable Incidencia inc){return service.getPedidosEstado(inc);}
} 
