import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, imparProduto, parSoma;

        parSoma = 0;
        imparProduto = 1;

        System.out.println("Digite os números a seguir (Digite -1 para parar o programa): ");

        while (true) {
            numero = input.nextInt();

            if (numero == -1) {
                break;
            } else if (numero % 2 == 0) {
                parSoma += numero;
            } else {
                imparProduto *= numero;
            }
        }

        System.out.println("A soma dos números pares é: " + parSoma);
        System.out.println("A soma dos números ímpares é: " + imparProduto);

        input.close();
    }
}