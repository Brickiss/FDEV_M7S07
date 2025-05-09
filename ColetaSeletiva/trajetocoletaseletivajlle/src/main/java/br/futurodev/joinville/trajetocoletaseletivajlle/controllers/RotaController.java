package br.futurodev.joinville.trajetocoletaseletivajlle.controllers;

import br.futurodev.joinville.trajetocoletaseletivajlle.models.Rota;
import br.futurodev.joinville.trajetocoletaseletivajlle.services.RotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rotas")
public class RotaController {

    @Autowired
    private RotaService service;

    @GetMapping
    public List<Rota> get() {
        return service.findAll();
    }

    @PostMapping
    public Rota post(@RequestBody Rota rota) {
        return service.create(rota);
    }
}
