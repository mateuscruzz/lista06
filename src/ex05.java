import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1<n2){
            for (int i = n1; i <= n2; i++){
                if (i%2 == 0){
                    System.out.println(i);
                }
            }
        }
        else {
            for (int i = n2; i <= n1; i++){
                if (i%2 == 0){
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
