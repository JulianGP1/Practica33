import Interfaces.Candidatos;
import Interfaces.Interfacee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Interfacee.lcandidatos();  // Registrar los candidatos
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Llama a registerVoto y verifica el resultado
            if (!Interfacee.registerVoto()) {
                break;  // Salir del bucle si el número no es válido
            }

            System.out.println("Ingrese 6 para salir");
            int i = sc.nextInt();  // Leer la opción de salida

            if (i == 6) {
                break;  // Salir del bucle si se ingresa 6
            }
        }

        Interfacee.sumarVotos();  // Mostrar el total de votos después de salir del bucle
        sc.close();  // Cerrar el scanner para evitar fugas de recursos
    }
}
