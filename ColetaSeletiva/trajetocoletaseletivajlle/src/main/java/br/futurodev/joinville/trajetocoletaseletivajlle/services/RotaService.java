package br.futurodev.joinville.trajetocoletaseletivajlle.services;

import br.futurodev.joinville.trajetocoletaseletivajlle.models.Rota;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotaService {


    public Rota create(Rota rota) {
        return Rota.addRota(rota);
    }


    public List<Rota> findAll() {
        return Rota.getRotas();
    }


    public Rota findById(Long id) {
        for (Rota rota : Rota.getRotas()) {
            if (rota.getId().equals(id)) {
                return rota;
            }
        }
        return null;

    }
}
