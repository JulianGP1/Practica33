package Interfaces;

import Votos.Votos;

import java.util.*;

public class Interfacee {
    static Scanner sc = new Scanner(System.in);
    static List<Candidatos> Lcandidatos = new ArrayList<>();

    public static List<Candidatos> lcandidatos() {
        for (int i = 0; i < 5; i++) {
            int num = i + 1;  // Cambiar para que cada candidato tenga un número único
            System.out.println("Enter the names of the 5 candidates:");
            String name = sc.nextLine();
            Candidatos candidado1 = new Candidatos(num, name, 0);
            Lcandidatos.add(candidado1);
        }

        System.out.println("Candidates:");
        for (Candidatos candidato1 : Lcandidatos) {
            System.out.println(candidato1.getNum() + ") " + candidato1.getNombre());
        }

        return Lcandidatos;
    }

    public static boolean registerVoto() {
        System.out.println("Enter the number of the candidate:");
        int num = sc.nextInt();

        try {
            switch (num) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    Candidatos candidato = Lcandidatos.get(num - 1); // Obtener el candidato usando el índice
                    int total = candidato.getVoto() + 1;
                    candidato.setVoto(total);
                    System.out.println("Los votos del candidato " + num + " son: " + total);
                    return true; // Voto registrado correctamente
                default:
                    System.out.println("Número no válido. Saliendo del bucle.");
                    return false; // Número no válido
            }
        } catch (Exception e) {
            System.out.println("Número no válido");
            return false; // También en caso de excepción, retornar false
        }
    }

    public static void sumarVotos() {
        int sumaTotal = 0;
        for (Candidatos candidato : Lcandidatos) {
            sumaTotal += candidato.getVoto();
        }
        System.out.println("Total de votos de todos los candidatos: " + sumaTotal);
    }
}
