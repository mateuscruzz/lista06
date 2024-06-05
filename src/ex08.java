import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n > 30) {
            for (int i = 0; i < n; i++) {
                if (i%2 == 0 || i%7 == 0){
                    System.out.println("\t" + i);
                }
            }
        }
        else{
            System.out.println("Informe um numero maior que 30");
        }
        sc.close();
    }
}
