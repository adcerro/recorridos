import java.util.Scanner;

public class Recorridos {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Digite dimensión n de la matriz de adyacencia:");
        int n = leer.nextInt();
        int[][] adyMat = new int[n][n];
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
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                System.out.print(adyMat[a][b]);
            }
            System.out.println("");
        }
        System.out.println("Digite la longitud k de caminos de que desea hallar");
        int k = leer.nextInt();
        int[][] paths;
        paths = matrixEponentiation(adyMat, k, n);
        for (int posi = 0; posi < n; posi++) {
            for (int posj = 0; posj < n; posj++) {
                if(paths[posi][posj]!=0)
                    System.out.println("Caminos de longitud " + k + " entre " + posi + " y " + posj + ": " + paths[posi][posj]);
            }
        }
    }

    public static int[][] matrixEponentiation(int[][] matA, int power, int size) {
        int[][] result = matA;
        for (int a = 1; a < power; a++) {
            result = matrixMultilication(result, matA, size);
        }
        return result;
    }

    public static int[][] matrixMultilication(int[][] matA, int[][] matB, int size) {
        int[][] result = new int[25][25];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int b= 0; b<size;b++){
                result[i][j] = result[i][j] + matA[i][b] * matB[b][j];}
            }
        }
        return result;
    }
}
