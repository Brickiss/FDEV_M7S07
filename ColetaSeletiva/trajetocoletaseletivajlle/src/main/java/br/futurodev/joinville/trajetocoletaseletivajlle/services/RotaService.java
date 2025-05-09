package br.futurodev.joinville.trajetocoletaseletivajlle.services;

import br.futurodev.joinville.trajetocoletaseletivajlle.models.Rota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RotaService {


    private Iterable<? extends Long> ids;

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

    public List<Rota> findByIds(List<Long> rotaIds) {
            List<Rota> foundRotas = new ArrayList<>();
            for (Long id : ids) {
                Rota rota = findById(id);
                if (rota != null) {
                    foundRotas.add(rota);
                }
            }
            return foundRotas;
        }

    }



