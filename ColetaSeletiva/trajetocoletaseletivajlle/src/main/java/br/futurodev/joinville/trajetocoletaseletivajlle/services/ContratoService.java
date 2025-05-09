package br.futurodev.joinville.trajetocoletaseletivajlle.services;

import br.futurodev.joinville.trajetocoletaseletivajlle.models.Coletor;
import br.futurodev.joinville.trajetocoletaseletivajlle.models.Contrato;
import br.futurodev.joinville.trajetocoletaseletivajlle.models.Rota;
import br.futurodev.joinville.trajetocoletaseletivajlle.services.ColetorService;
import br.futurodev.joinville.trajetocoletaseletivajlle.services.RotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ContratoService {
    @Autowired
    private ColetorService coletorService;
    @Autowired
    private RotaService rotaService;
    // Método para registrar um contrato
    public Contrato registrarContrato(Long coletorId, List<Long> rotaIds) {
        Coletor coletor = coletorService.findById(coletorId);
        if (coletor == null) {
            throw new IllegalArgumentException("Coletor não encontrado");
        }
        List<Rota> rotas = rotaService.findByIds(rotaIds);
        if (rotas.isEmpty()) {
            throw new IllegalArgumentException("Nenhuma rota encontrada");
        }
        Contrato contrato = new Contrato(coletor, rotas);
        Contrato.addContrato(contrato);
        return contrato;
    }
    // Método para consultar todos os contratos
    public List<Contrato> consultarContratos() {
        return Contrato.getContratos();
    }
}