import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<10;i++){
            int num = sc.nextInt();
            sum += num;
        }
        int m = sum / 10;
        System.out.println("a media é: " + m);
        sc.close();
    }
}
