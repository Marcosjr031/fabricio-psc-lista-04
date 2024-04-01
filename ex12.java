import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Termo1 = 1;
        int Termo2 = 4;
        int Termo3 = 4;

        System.out.println("Insira o número de termos que deseja gerar: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 1) {
                System.out.print(Termo1 + " ");
                Termo1++;
            } else if (i % 3 == 2) {
                System.out.print(Termo2 + " ");
                Termo2++;
            } else {
                System.out.print(Termo3 + " ");
                Termo3++;
            }
        }
        input.close();
    }
}