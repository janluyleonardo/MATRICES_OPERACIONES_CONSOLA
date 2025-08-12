package matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        System.out.println("VAMOS A PROGRAMAR DOS MATRICES!!!");
        System.out.println("De cuantas filas desea la matriz A?");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        System.out.println("De cuantas columnas desea la matriz A?");
        int num1 = sn.nextInt();
        System.out.println("Por favor digite los numeros de la matriz A");

        int M[][] = new int[num][num1];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num1; j++) {
                M[i][j] = sn.nextInt();
            }
        }
        System.out.println("Numeros ingresados correctamente!!");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Su matriz A es de: " + num + " x " + num1);
        System.out.println("De cuantas filas desea la matriz B?");
        int num2 = sn.nextInt();
        System.out.println("De cuantas columnas desea la matriz B? ");
        int num3 = sn.nextInt();
        System.out.println("Por favor digite los numeros de la matriz B!!");

        int N[][] = new int[num2][num3];
        for (int k = 0; k < num2; k++) {
            for (int l = 0; l < num3; l++) {
                N[k][l] = sn.nextInt();
            }
        }
        System.out.println("Numeros ingresados correctamente!!");

        for (int k = 0; k < num2; k++) {
            for (int l = 0; l < num3; l++) {
                System.out.print(N[k][l] + " ");
            }
            System.out.println();
        }
        System.out.println("Su matriz B es de: " + num2 + " x " + num3);
        System.out.println("Elija la opcion que quiere realizar con las matrices");
        System.out.println("1. Multiplicacion!!");
        System.out.println("2. Division!!");
        System.out.println("3. Suma!!");
        System.out.println("4. Resta!!");

        int op = sn.nextInt();
        if (op == 1) {
            int i, j = 0, k = 0, l = 0;
            int o[][] = new int[num][num];
            for (int f = 0; f < num; f++) {
                for (int c = 0; c < num3; c++) {
                    for (i = 0; i < num; i++) {
                        o[f][c] = M[i][j] * N[k][l];
                    }
                    System.out.print(o[f][c] + " ");
                    System.out.println();
                }

            }

        }
    }
}
