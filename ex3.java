import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int killsTotal, assistTotal, deathsTotal, kills, assists, deaths;
        char resposta;

        killsTotal = 0;
        assistTotal = 0;
        deathsTotal = 0;

        while (true) {
            System.out.println("Insira o número de kills: ");
            kills = input.nextInt();
            killsTotal += kills;

            System.out.println("Insira o número de assists: ");
            assists = input.nextInt();
            assistTotal += assists;

            System.out.println("Insira o número de deaths: ");
            deaths = input.nextInt();
            deathsTotal += deaths;

            if (killsTotal <= 5) {
                System.out.println("Noob!");
            } else if (killsTotal >= 20) {
                System.out.println("Master!");
            }
            if (deathsTotal >= 20) {
                System.out.println("Houston, we have a problem");
            }
            if (assistTotal >= 20) {
                System.out.println("Team Work!");
            }
            System.out.println("Existe um vencedor (s/n)?");
            resposta = input.next().charAt(0);
            if (resposta == 's' || resposta == 'S') {
                break;
            }
        }
        input.close();
    }
}