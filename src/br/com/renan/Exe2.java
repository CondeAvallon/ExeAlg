package br.com.renan;

import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        int linhas = obterLinhasMatriz();
        int colunas = obterColunasMatriz();
        int[][] matriz = criarMatriz(linhas, colunas);
        popularMatriz(matriz);
        exibirMatriz(matriz);
        exibirTransposta(matriz);
    }

    public static int obterLinhasMatriz() {
        System.out.println("=== PROGRAMA DE TRANSPOSTA DA MATRIZ ===\n");
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

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("\n=== MATRIZ ===\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print(matriz[i][j] + "  ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void exibirTransposta(int[][] matriz) {
        System.out.println("\n=== TRANSPOSTA ===\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print(matriz[j][i] + "  ");
                } else {
                    System.out.print(matriz[j][i] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }

}
