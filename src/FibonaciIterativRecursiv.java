import java.util.Scanner;

public class FibonaciIterativRecursiv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        fibonaciIterativ(s);
        int res = fibonaciRecursive(s);
        System.out.println(res);


    }

    public static int fibonaciIterativ(int n){
        int f1 = 1;
        int f2 = 1;
        if (n == 0){
            return 0;
        }
        System.out.print("1 1 ");
        for(int i = 3; i <= n; i++){
            int fAux = f1;
            f1 = f1 + f2;
            f2 = fAux;
            System.out.print(f1 + " ");
        }
        return f1;
    }

    public static int fibonaciRecursive(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibonaciRecursive(n - 2) + fibonaciRecursive(n - 1);
        }
    }

}
