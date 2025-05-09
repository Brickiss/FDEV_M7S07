package br.futurodev.joinville.trajetocoletaseletivajlle.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Coletor {
        @Getter
        private static final List<Coletor> coletores = new ArrayList<>();
        private static Long sequence = 1L;

        @Setter(AccessLevel.NONE)
        private Long id;
        private String name;
        private String description;

        public Coletor(String name, String description) {
            this.id = sequence++;
        }

        public static Coletor addColetor(Coletor coletor) {
            coletores.add(coletor);
            return coletor;
        }

    public static List<Coletor> getCollectors() {
        return List.of();
    }

    @Override
        public String toString() {
            return "Coletor{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }
