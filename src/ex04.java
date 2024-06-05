import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior que 100: ");
        int num = sc.nextInt();

        if (num <= 100) {
            System.out.println("Número inválido. Por favor, insira um número maior que 100.");
            return;
        }

        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
        sc.close();
    }
}