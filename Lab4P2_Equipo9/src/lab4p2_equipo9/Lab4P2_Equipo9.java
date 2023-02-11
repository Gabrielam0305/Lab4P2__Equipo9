/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_equipo9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela Montes
 */
public class Lab4P2_Equipo9 {
<<<<<<< HEAD
    public static Object[][] tablero= new Object[8][8];
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
=======
public static Object[][] tablero= new Object[8][8];
    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
>>>>>>> 1e12047f8bd6f608cfa953f75fdac070628cec87
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "";

            }
        }
        tablero[0][0]="r";
        tablero[1][0]="n";
        tablero[2][0]="b";
        tablero[3][0]="q";
        tablero[4][0]="k";
        tablero[5][0]="b";
        tablero[6][0]="n";
        tablero[7][0]="r";
        tablero[0][1]="p";
        tablero[1][1]="p";
        tablero[2][1]="p";
        tablero[3][1]="p";
        tablero[4][1]="p";
        tablero[5][1]="p";
        tablero[6][1]="p";
        tablero[7][1]="p";
        tablero[0][7]="R";
        tablero[1][7]="N";
        tablero[2][7]="B";
        tablero[3][7]="Q";
        tablero[4][7]="K";
        tablero[5][7]="B";
        tablero[6][7]="N";
        tablero[7][7]="R";
        tablero[0][6]="P";
        tablero[1][6]="P";
        tablero[2][6]="P";
        tablero[3][6]="P";
        tablero[4][6]="P";
        tablero[5][6]="P";
        tablero[6][6]="P";
        tablero[7][6]="P";
        imprimirMatriz((String[][]) tablero);
        ArrayList <Piezas> piezas = new ArrayList();
        System.out.println("Ingrese la pieza a mover y su destino");
        String move=entrada.nextLine();
        
                }
    public static String[][] llenarMatriz_BM(ArrayList <Piezas> piezas, int f, int c, int f1, int f2, String p) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "";

            }
        }
        return matriz;
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // fila
            for (int j = 0; j < matriz[i].length; j++) {// columna
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

   public static void split (String ent){
        String nueva []=ent.split("|");
        int fila;
        int columna;
         int fila1;
        int columna1;
        for (int i = 0; i < 2; i++) {
           String obj[]=nueva[i].split("-");
                String coor=obj[0];
                if (coor.charAt(0)=='a') {
                    fila=0;
                }else if (coor.charAt(0)=='b') {
                    fila=1;
                }else if (coor.charAt(0)=='c') {
                    fila=2;
                }else if (coor.charAt(0)=='d') {
                    fila=3;
                }else if (coor.charAt(0)=='e') {
                    fila=4;
                }else if (coor.charAt(0)=='f') {
                    fila=5;
                }else if (coor.charAt(0)=='g') {
                    fila=6;
                }else if (coor.charAt(0)=='h') {
                    fila=7;
                }
                
                if (coor.charAt(1)==1) {
                    columna=0;
                }else if (coor.charAt(1)==2) {
                    columna=1;
                }else if (coor.charAt(1)==3) {
                    columna=2;
                }else if (coor.charAt(1)==4) {
                    columna=3;
                }else if (coor.charAt(1)==5) {
                    columna=4;
                }else if (coor.charAt(1)==6) {
                    columna=5;
                }else if (coor.charAt(1)==7) {
                    columna=6;
                }else if (coor.charAt(1)==8) {
                    columna=7;
                }
                String coor2=obj[1];
                if (coor2.charAt(0)=='a') {
                    fila1=0;
                }else if (coor2.charAt(0)=='b') {
                    fila1=1;
                }else if (coor2.charAt(0)=='c') {
                    fila1=2;
                }else if (coor2.charAt(0)=='d') {
                    fila1=3;
                }else if (coor2.charAt(0)=='e') {
                    fila1=4;
                }else if (coor2.charAt(0)=='f') {
                    fila1=5;
                }else if (coor2.charAt(0)=='g') {
                    fila1=6;
                }else if (coor2.charAt(0)=='h') {
                    fila1=7;
                }
                
                if (coor2.charAt(1)==1) {
                    columna1=0;
                }else if (coor2.charAt(1)==2) {
                    columna1=1;
                }else if (coor2.charAt(1)==3) {
                    columna1=2;
                }else if (coor2.charAt(1)==4) {
                    columna1=3;
                }else if (coor2.charAt(1)==5) {
                    columna1=4;
                }else if (coor2.charAt(1)==6) {
                    columna1=5;
                }else if (coor2.charAt(1)==7) {
                    columna1=6;
                }else if (coor2.charAt(1)==8) {
                    columna1=7;
                }
                
       }
   }
}

