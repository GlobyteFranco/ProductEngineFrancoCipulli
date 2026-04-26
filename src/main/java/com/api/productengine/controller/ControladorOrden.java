package com.api.productengine.controller;

import com.api.productengine.model.Orden;
import com.api.productengine.service.ServicioOrden;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class ControladorOrden {

    private final ServicioOrden service;

    public ControladorOrden(ServicioOrden service) {
        this.service = service;
    }

    // Crear una orden a partir de un producto
    @PostMapping("/product/{productId}")
    public Orden createOrder(@PathVariable Long productId) {
        return service.createOrder(productId);
    }

    @GetMapping
    public List<Orden> getAll() {
        return service.findAll();
    }
}