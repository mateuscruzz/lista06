import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 2;i<=num;i++){
            int c = b;
            b = a + b;
            a = c;
        }
        System.out.println(b);
        sc.close();
    }
}
