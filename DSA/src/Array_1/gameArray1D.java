package Array_1;

import java.util.Scanner;

public class gameArray1D {
    public static boolean canWin(int leap, int i, int[] game){
        //dieu kien thang
        if(i >= game.length){
            return true;
        }
        //dieu kien thua
        if (i < 0 || game[i] == 1){
            return false;
        }
        //danh dau vi tri
        game[i] = 1;
        return canWin(leap,i+1,game) || canWin(leap, i - 1, game) || canWin(leap, i + leap, game);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //so lan choi
        int q = scanner.nextInt();
        String[] results = new String[q];
        for (int i = 0; i < q; i++) {
            //  nhap n va leap
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            //  doc mang game
            int[] game = new int[n];
            for (int j = 0; j < game.length; j++) {
                game[j] = scanner.nextInt();
            }
            results[i] = canWin(leap, 0, game) ? "YES" : "NO";
        }

        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();

    }
}
