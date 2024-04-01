import java.util.Random;
import java.util.Scanner;
import java.lang.Character;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random valor = new Random();

        int numero = valor.nextInt(1,100);
        int palpite = 0;
        int tentativas = 0;
        boolean acertou = false;

        boolean jogarNovamente = false;
        char jogarNovamenteSN = ' ';

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100...");
        System.out.println("Tente adivinhar qual é!");
        

        while (!acertou || jogarNovamente)
        {
            tentativas++;

            System.out.print("\nDigite seu palpite: ");
            palpite = input.nextInt();

            if (palpite > numero)
                System.out.println("Muito alto");
            else if (palpite < numero)
                System.out.println("Muito baixo");
            else if (palpite == numero){
                System.out.println("Correto!");
                System.out.println("Numero de tentativas: " + tentativas);
                acertou = true;

                System.out.println("\nDeseja jogar novamente? (S/N)");
                jogarNovamenteSN = input.next().charAt(0);

                jogarNovamente = Character.toUpperCase(jogarNovamenteSN) == 'S' ? true : false;                
            }

        }

        input.close();

    }

}