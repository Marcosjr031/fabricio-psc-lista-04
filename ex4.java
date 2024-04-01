import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Random pontos = new Random();

        int kills = 0;
        int deaths = 0;
        int assists = 0;

        int deathsTotal = 0;
        int assistsTotal = 0;

        int rodada = 0;

        boolean temVencedor = false;

        System.out.println("CAMPEONATO ");

        
        while (!temVencedor) {
            rodada++;

            kills = pontos.nextInt(1,20);
            deaths = pontos.nextInt(1,20);
            assists = pontos.nextInt(1,20);

            deathsTotal += deaths;
            assistsTotal += assists;

            System.out.println("\nRodada: " + rodada);
            System.out.println("kills\tDeaths\tAssists\tDeaths Total\tAssists Total");
            System.out.println(kills + "\t"+ deaths + "\t" + assists + "\t" + deathsTotal + "\t\t" + assistsTotal);

            if (kills <= 5 && assistsTotal <= 20)
                System.out.println("Noob");
            else if (kills >= 20 && assistsTotal <= 20)
                System.out.println("Master");

            if (deathsTotal >= 20 && assistsTotal <= 20)
                System.out.println("Houston, we have a problem");

            if(assistsTotal >= 20)
            {
                System.out.println("Team work!");
                temVencedor = true;
            } 
        }

    }
}