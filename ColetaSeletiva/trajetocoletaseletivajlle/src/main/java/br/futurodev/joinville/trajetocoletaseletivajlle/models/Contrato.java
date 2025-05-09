package br.futurodev.joinville.trajetocoletaseletivajlle.models;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Contrato {
    private static Long sequence = 1L;
    private static final List<Contrato> contratos = new ArrayList<>();

    @Setter(AccessLevel.NONE)
    private Long id;
    private Coletor coletor;
    private List<Rota> rotas;

    public Contrato(Coletor coletor, List<Rota> rotas) {
        this.id = sequence++;
        this.coletor = coletor;
        this.rotas = rotas;
    }

    public static Contrato addContrato(Contrato contrato) {
        contratos.add(contrato);
        return contrato;
    }

    public static List<Contrato> getContratos() {
        return new ArrayList<>(contratos);
    }
}
