package br.com.renan;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        int linhas = obterLinhasMatriz();
        int colunas = obterColunasMatriz();
        int[][] matriz1 = criarMatriz(linhas, colunas);
        int[][] matriz2 = criarMatriz(linhas, colunas);
        popularMatriz(matriz1);
        exibirMatriz(matriz1);
        popularMatriz(matriz2);
        exibirMatriz(matriz2);
        int[][] somaDasMatrizes = somarMatrizes(matriz1,matriz2);
        exibirSomaMatriz(somaDasMatrizes);
    }

    public static int obterLinhasMatriz() {
        System.out.println("=== PROGRAMA DE MATRIZ ===\n");
        Scanner console = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas da matriz: ");
        int linhas = Integer.parseInt(console.nextLine());
        return linhas;
    }

    public static int obterColunasMatriz() {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite a quantidade de colunas da matriz: ");
        int colunas = Integer.parseInt(console.nextLine());
        System.out.println("\n===================================");
        return colunas;
    }

    public static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        return matriz;
    }

    public static void popularMatriz(int[][] matriz) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor do índice [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = Integer.parseInt(console.nextLine());
            }
        }
        System.out.println("===================================");
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] somaDasMatrizes = new int[matriz1.length][matriz1.length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                somaDasMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return somaDasMatrizes;
    }
    
    public static void exibirMatriz(int[][] matriz){
        System.out.println("=== MATRIZ ===\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < 10){
                System.out.print(matriz[i][j] + "  ");
                } else {
                System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n===");
    }
    
    public static void exibirSomaMatriz(int[][] matriz){
        System.out.println("=== SOMA DAS MATRIZES ===\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < 10){
                System.out.print(matriz[i][j] + "  ");
                } else {
                System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }

}
