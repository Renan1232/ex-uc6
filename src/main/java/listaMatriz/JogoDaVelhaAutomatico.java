package listaMatriz;

import java.util.Scanner;

public class JogoDaVelhaAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        String jogador1;
        boolean jogoAtivo = true;
        int jogadas = 0;
        char jogadorAtual = 'X';

        // Inicializando o tabuleiro vazio
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        // Lendo o nome do jogador 1
        System.out.print("Digite o nome do jogador 1 (X): ");
        jogador1 = scanner.nextLine();
        String jogador2 = "Computador";

        // Loop principal do jogo
        while (jogoAtivo) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Vez do jogador " + (jogadorAtual == 'X' ? jogador1 : jogador2) + " (" + jogadorAtual + ")");

            int linha, coluna;
            if (jogadorAtual == 'X') {
                // Leitura da jogada do jogador 1
                while (true) {
                    System.out.print("Digite a linha (0-2): ");
                    linha = scanner.nextInt();
                    System.out.print("Digite a coluna (0-2): ");
                    coluna = scanner.nextInt();

                    if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                        System.out.println("Movimento inválido! Tente novamente.");
                    } else {
                        break;
                    }
                }
            } else {
                // Jogada automática do computador
                while (true) {
                    linha = (int)(Math.random() * 3);
                    coluna = (int)(Math.random() * 3);

                    if (tabuleiro[linha][coluna] == ' ') {
                        break;
                    }
                }
                System.out.println("Computador jogou na linha " + linha + " coluna " + coluna);
            }

            // Inserindo a jogada no tabuleiro
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            // Verificando se o jogador atual venceu
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador " + (jogadorAtual == 'X' ? jogador1 : jogador2) + " venceu!");
                jogoAtivo = false;
            } else if (jogadas == 9) {
                // Verificando se houve empate
                exibirTabuleiro(tabuleiro);
                System.out.println("O jogo terminou em empate!");
                jogoAtivo = false;
            } else {
                // Alternando o jogador
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    // Função para exibir o tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    // Função para verificar se um jogador venceu
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }
        // Verificar colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }
}
