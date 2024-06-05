import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtPos = 0, qtNeg = 0, sumPos = 0, sumNeg = 0;
        for (int i = 0; i < 15; i++){
            int num = sc.nextInt();
            if (num == 0){
                System.out.println("Numero deve ser diferente de zero");
                System.exit(0);
            }
            else if (num > 0){
                qtPos++;
                sumPos += num;
            }
            else {
                qtNeg++;
                sumNeg += num;
            }
        }

        System.out.println("Qtd positivos: " + qtPos +
                "\nQtd negativos: " + qtNeg +
                "\nSoma positivos: " + sumPos +
                "\nSoma negativos: " + sumNeg);

        sc.close();
    }
}
