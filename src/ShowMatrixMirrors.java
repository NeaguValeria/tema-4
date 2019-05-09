import java.util.Scanner;

public class ShowMatrixMirrors {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ma = new int[SIZE][SIZE];
        int count = 0;
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                count++;
                ma[i][j] = count;
            }
        }
        showMatrice(ma);
        mirrorVertically(ma);
        mirrorHorrizontally(ma);
        mirrorBothWays(ma);

    }

    public static void showMatrice(int[][] ma1) {
        for (int i = 0; i < ma1.length; i++) {
            for (int j = 0; j < ma1[i].length; j++) {
                System.out.print(ma1[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] mirrorVertically(int[][] ma) {
        int[][] mirrorV = new int[SIZE][SIZE];
        int imageRows = 0;
        System.out.println("Vertically Mirror:" + " ");
        for (int i = ma.length - 1; i >= 0; i--) {
            for (int j = 0; j < ma[i].length; j++) {
                mirrorV[imageRows][j] = ma[i][j];
            }
            imageRows++;
        }
        showMatrice(mirrorV);
        return mirrorV;
    }

    public static int[][] mirrorHorrizontally(int[][] ma) {
        int[][] mirrorH = new int[SIZE][SIZE];
        System.out.println("Horrizontally Mirror:" + " ");
        for (int i = 0; i < ma.length; i++) {
            int imageColumn = 0;
            for (int j = ma.length - 1; j >= 0; j--) {
                mirrorH[i][imageColumn] = ma[i][j];
                imageColumn++;
            }
        }
        showMatrice(mirrorH);
        return mirrorH;
    }

    public static int[][] mirrorBothWays(int[][] m) {
        int[][] mirrorBW = new int[SIZE][SIZE];
        System.out.println("Both Ways Mirror:" + " ");
        int imageRows = 0;
        for (int i = m.length - 1; i >= 0; i--) {
            int imageColumn = 0;
            for (int j = m.length - 1; j >= 0; j--) {
                mirrorBW[imageRows][imageColumn] = m[i][j];
                imageColumn++;
            }
            imageRows++;
        }
        showMatrice(mirrorBW);
        return mirrorBW;
    }
}
