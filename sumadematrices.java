import java.util.Scanner;

public class sumadematrices {
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el número de filas: ");
        int filas = entrada.nextInt();
        System.out.print("Ingresa el número de columnas: ");
        int columnas = entrada.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        System.out.println("Ingresa los elementos de la primera matriz:");
        leerMatriz(entrada, matriz1);
        System.out.println("Ingresa los elementos de la segunda matriz:");
        leerMatriz(entrada, matriz2);

        int[][] resultado = sumarMatrices(matriz1, matriz2);

        System.out.println("Matriz resultante de la suma:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }

    private static void leerMatriz(Scanner entrada, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
}
