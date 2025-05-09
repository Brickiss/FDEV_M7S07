package br.futurodev.joinville.trajetocoletaseletivajlle.controllers;

import br.futurodev.joinville.trajetocoletaseletivajlle.models.Coletor;
import br.futurodev.joinville.trajetocoletaseletivajlle.services.ColetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("coletores")
public class ColetorController {

    @Autowired
    private ColetorService service;

    @GetMapping
    public List<Coletor> get() {
        return service.findAll();
    }

    @PostMapping
    public Coletor post(@RequestBody Coletor coletor) {
        return service.create(coletor);
    }
}


