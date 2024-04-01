import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero, numeroQuadrado, numeroCubo, numeroRaiz;

        System.out.println("Digite os números a seguir (Digite um número negativo ou 0 para finalizar o programa): ");

        while (true) {
            numero = input.nextInt();

            if(numero == 0 || numero < 0 ){
                break;
            } else{
                System.out.println("O número é: " + numero);
                numeroQuadrado = numero * numero;
                System.out.println("O quadrado do número é: " + numeroQuadrado);
                numeroCubo = numero * numero * numero;
                System.out.println("O cubo do número é: " + numeroCubo);
                numeroRaiz = Math.sqrt(numero);
                System.out.println("A raiz do número é: " + numeroRaiz);
            }
        }
        input.close();
    }
}