package br.com.renan;

import java.util.Scanner;

public class Exe3 {

    public static void main(String[] args) {
        int linhas = obterLinhasMatriz();
        int colunas = obterColunasMatriz();
        int[][] matriz = criarMatriz(linhas, colunas);
        popularMatriz(matriz);
        exibirMatriz(matriz);
        somarElementosMatriz(matriz);
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

    public static void somarElementosMatriz(int[][] matriz) {
        int soma = 0;
        System.out.println("\n=== SOMA DOS ELEMENTOS DA MATRIZ ===\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz é: " + soma);
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }

}
