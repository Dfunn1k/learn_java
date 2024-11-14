package Semana2;

public class Ejercicio19 {
    public static void main(String[] args) {
        int [][] matriz = new int[5][3];

        matriz[0] = new int[]{5, 1};
        matriz[1] = new int[]{3, 2};
        matriz[2] = new int[]{1, 0};

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
