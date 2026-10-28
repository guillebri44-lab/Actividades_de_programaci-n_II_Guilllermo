import java.util.Scanner;

public class buscarnumeroarreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos números tendrá el arreglo? ");
        int cantidad = entrada.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.print("¿Qué número quieres buscar? ");
        int buscado = entrada.nextInt();
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + buscado + " está en el arreglo.");
        } else {
            System.out.println("El número " + buscado + " no está en el arreglo.");
        }

        entrada.close();
    }
}
