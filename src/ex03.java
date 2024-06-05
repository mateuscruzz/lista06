import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero maior que 20");
        int num = sc.nextInt();
        for (int i = 1;i<=num;i++){
            if (num%i == 0){
                System.out.print(i +"\t");
            }
        }

        sc.close();
    }
}
