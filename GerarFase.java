package GerarFaseMatriz;

import java.util.Random;

public class GerarFase {
    private int largura;
    private int altura;
    private int mat[][];

    public GerarFase(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        this.mat = new int[largura][altura];
    }

    public void matrizFase() {
        Random random = new Random();
        int num;

        for (int i = 0; i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                num = random.nextInt(10);
                if (i == 0 || j == 0 || i == largura - 1 || j == altura - 1) {
                    mat[i][j] = 2;
                }
            }
        }

        for (int i = 1; i < largura - 1; i++) {
            for (int j = 1; j < altura - 1; j++) {
                if (i != 0 || j != 0) {
                    num = random.nextInt(10);
                    if (num <= 3) {
                        mat[i][j] = 1;
                    } else {
                        mat[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < largura - 1; i++) {
            for (int j = 1; j < altura - 1; j++) {
                num = random.nextInt(10);
                if (mat[i][j] == 0 && num <= 2) {
                    mat[i][j] = 3;
                }
            }
        }
    }

    public void imprimirMatrizFase() {
        for (int i = 0; i < this.largura; i++) {
            for (int j = 0; j < this.altura; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        GerarFase fase = new GerarFase(7, 7);
        fase.matrizFase();
        fase.imprimirMatrizFase();
    }

}
