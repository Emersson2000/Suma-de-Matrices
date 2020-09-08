package Suma_De_Matríz;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas de la matríz"));
        int nColum = Integer.parseInt(JOptionPane.showInputDialog("Digite en número de columnas de la matríz"));
        
        Matriz llamar = new Matriz(nFilas, nColum);
        
        llamar.datosMatriz1();
        llamar.datosMatriz2();
        llamar.sumaTotalMatriz();
        llamar.matrarMatrices(nFilas, nColum);
        llamar.mostrarSumaMatriz();
    }
}
