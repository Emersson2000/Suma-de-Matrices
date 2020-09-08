package Suma_De_Matríz;

import java.util.Scanner;

public class Matriz {

    static Scanner entrada = new Scanner(System.in);
    private int matriz1[][];
    private int matriz2[][];
    private int matrizTotal[][];

    public Matriz(int x, int y) {
        this.matriz1 = new int[x][y];
        this.matriz2 = new int[x][y];
        this.matrizTotal = new int[x][y];
    }

    public void datosMatriz1() {
        System.out.println("Matríz Nro: 1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("Digite un número [" + i + "] [" + j + "] : ");
                matriz1[i][j] = entrada.nextInt();
            }

        }
    }

    public void datosMatriz2() {
        System.out.println("\nMatríz Nro: 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("Digite un número [" + i + "] [" + j + "] : ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
    }
    
    public void sumaTotalMatriz() {
        for (int i = 0; i < matrizTotal.length; i++) {
            for (int j = 0; j < matrizTotal[i].length; j++) {
                matrizTotal[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }
    
    public void matrarMatrices(int x, int y) {
        System.out.println("\nMatríz Nro1: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatríz Nro2: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public void mostrarSumaMatriz() {
        System.out.println("\nLa suma de las dos matrices es: ");
        for (int i = 0; i < matrizTotal.length; i++) {
            for (int j = 0; j < matrizTotal[i].length; j++) {
                System.out.print(matrizTotal[i][j]+"  ");
            }
            System.out.println("");
        }
    }

}
