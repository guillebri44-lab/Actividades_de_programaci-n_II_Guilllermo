import java.util.Scanner;

public class eliminarduplicadosarreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos números tendrá el arreglo? ");
        int cantidad = entrada.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        int[] sinDuplicados = new int[cantidad];
        int cantidadUnicos = 0;

        for (int numero : numeros) {
            boolean repetido = false;
            for (int i = 0; i < cantidadUnicos; i++) {
                if (sinDuplicados[i] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                sinDuplicados[cantidadUnicos] = numero;
                cantidadUnicos++;
            }
        }

        System.out.print("Arreglo sin duplicados: [");
        for (int i = 0; i < cantidadUnicos; i++) {
            System.out.print(sinDuplicados[i]);
            if (i < cantidadUnicos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        entrada.close();
    }
}
