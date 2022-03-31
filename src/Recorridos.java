import java.util.Scanner;

public class Recorridos {


    public static void main(String[] args) {
        int[][] adyMat = new int[25][25];
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite dimensión n de la matriz de adyacencia:");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = 0;
                do {
                    System.out.println("Digite valor de A(" + i + "," + j + ")");
                    val = leer.nextInt();
                } while (val != 0 && val != 1);
                adyMat[i][j] = val;
            }
        }
        System.out.println("Matriz ingresada:");
        for (int a = 0; a< n; a++) {
            for (int b = 0; b < n; b++) {
                System.out.print(adyMat[a][b]);
            }
            System.out.println("");
        }
        System.out.println("Digite el vertice Vi desde el que desea empezar");
        System.out.println("Digite el vertice Vj desde el que desea empezar");

    }
}
