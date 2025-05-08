package br.futurodev.joinville.trajetocoletaseletivajlle.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
  public class Rota {

        @Getter
        private static final List<Rota> rotas = new ArrayList<>();
        private static Long sequence = 1L;

        @Setter(AccessLevel.NONE)
        private Long id;
        private String description;
        private String coverageArea;
        private BigDecimal efficiencyPercentage;

        public Rota(String descricao, String areaAbrangencia, Double percentualEficiencia) {
            this.id = sequence++;
        }

        public static Rota addRoute(Rota rota) {
            rotas.add(rota);
            return rota;
        }

    public static void addRota(Rota novaRota) {
    }
}

