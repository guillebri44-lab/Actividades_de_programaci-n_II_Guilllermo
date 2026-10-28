import java.util.Scanner;

public class intercalararreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos elementos tendrá cada arreglo? ");
        int cantidad = entrada.nextInt();
        int[] primero = new int[cantidad];
        int[] segundo = new int[cantidad];
        int[] intercalado = new int[cantidad * 2];

        System.out.println("Ingresa los elementos del primer arreglo:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            primero[i] = entrada.nextInt();
        }

        System.out.println("Ingresa los elementos del segundo arreglo:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            segundo[i] = entrada.nextInt();
        }

        for (int i = 0; i < cantidad; i++) {
            intercalado[i * 2] = primero[i];
            intercalado[i * 2 + 1] = segundo[i];
        }

        System.out.print("Arreglo intercalado: [");
        for (int i = 0; i < intercalado.length; i++) {
            System.out.print(intercalado[i]);
            if (i < intercalado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        entrada.close();
    }
}
