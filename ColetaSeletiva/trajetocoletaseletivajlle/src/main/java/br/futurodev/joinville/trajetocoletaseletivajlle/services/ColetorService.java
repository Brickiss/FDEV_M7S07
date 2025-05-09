package br.futurodev.joinville.trajetocoletaseletivajlle.services;

import br.futurodev.joinville.trajetocoletaseletivajlle.models.Coletor;

import java.security.cert.Extension;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ColetorService {


    public Coletor create(Coletor collector) {
        return Coletor.addColetor(collector);
    }

    // Método para encontrar todos os coletores
    public List<Coletor> findAll() {
        return Coletor.getCollectors();
    }

    public Coletor findById(Long id) {
        for (Coletor collector : Coletor.getCollectors()) {
            if (collector.getId().equals(id)) {
                return collector;
            }
        }
        return null;
    }
}


