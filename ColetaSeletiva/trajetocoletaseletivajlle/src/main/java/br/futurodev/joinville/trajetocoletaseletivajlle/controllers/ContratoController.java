package br.futurodev.joinville.trajetocoletaseletivajlle.controllers;

import br.futurodev.joinville.trajetocoletaseletivajlle.models.Contrato;
import br.futurodev.joinville.trajetocoletaseletivajlle.services.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contratos")
public class ContratoController {

    @Autowired
    private ContratoService service;

    @PostMapping("/{coletorId}")
    public Contrato post(@PathVariable Long coletorId, @RequestBody List<Long> rotaIds) {
        return service.registrarContrato(coletorId, rotaIds);
    }

    @GetMapping
    public List<Contrato> get() {
        return service.consultarContratos();
    }
}
