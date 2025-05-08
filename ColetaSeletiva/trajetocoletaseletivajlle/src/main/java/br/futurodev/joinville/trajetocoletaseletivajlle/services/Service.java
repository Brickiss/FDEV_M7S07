package br.futurodev.joinville.trajetocoletaseletivajlle.services;

import br.futurodev.joinville.trajetocoletaseletivajlle.models.Coletor;
import br.futurodev.joinville.trajetocoletaseletivajlle.models.Rota;

import java.util.List;

public class Service {



        public Rota cadastrarRota(String descricao, String areaAbrangencia, Double percentualEficiencia) {
            Rota novaRota = new Rota(descricao, areaAbrangencia, percentualEficiencia);
            Rota.addRota(novaRota);
            return novaRota;
        }


        public List<Rota> consultarRotas() {
            return Rota.getRotas();
        }


        public Coletor cadastrarColetor(String name, String description) {
            Coletor novoColetor = new Coletor(name, description);
            Coletor.addColetor(novoColetor);
            return novoColetor;
        }


        public List<Coletor> consultarColetores() {
            return Coletor.getCollectors();
        }
    }


