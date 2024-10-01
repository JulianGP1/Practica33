package Votos;

import Interfaces.Candidatos;
import java.util.List;

public class Votos {

    private List<Candidatos> candidatos;

    // Constructor que recibe la lista de candidatos
    public Votos(List<Candidatos> candidatos) {
        this.candidatos = candidatos;
    }

    // Método para registrar un voto para un candidato específico
    public void registrarVoto(int indiceCandidato) {
        if (candidatos != null && !candidatos.isEmpty()) {
            if (indiceCandidato >= 0 && indiceCandidato < candidatos.size()) {
                Candidatos candidato = candidatos.get(indiceCandidato);
                candidato.setVoto(candidato.getVoto() + 1);
                System.out.println("Voto registrado para: " + candidato.getNombre());
            } else {
                System.out.println("Índice del candidato inválido.");
            }
        } else {
            System.out.println("La lista de candidatos está vacía o es nula.");
        }
    }

    // Método para mostrar los votos de todos los candidatos
    public void mostrarResultados() {
        if (candidatos != null && !candidatos.isEmpty()) {
            System.out.println("Resultados de los votos:");
            for (Candidatos candidato : candidatos) {
                System.out.println(candidato.getNombre() + ": " + candidato.getVoto() + " votos.");
            }
        } else {
            System.out.println("No hay candidatos para mostrar.");
        }
    }
}
