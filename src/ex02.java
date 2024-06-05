import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int menor = num;
        int maior = num;
        for (int i = 0;i<9;i++){
            num = sc.nextInt();
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("Maior: " + maior
                            + "\nMenor: " + menor);
        sc.close();
    }
}
