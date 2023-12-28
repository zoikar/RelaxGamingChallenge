import java.util.Random;

import static java.lang.Math.sqrt;

public class SecondGame {
    public SecondGame(int x){
        //Second Game
        for(int i=0;i<x;i++){
            //System.out.println("\n" + (i + 1) + " Roll Group");
            int j = 0;
            while (j < 24) {
                dice1 = rnd.nextInt(6) + 1;
                dice2 = rnd.nextInt(6) + 1;
               // System.out.println(dice1 + " and " + dice2);
                if (dice2 == 6 && dice1 == 6) {
                    winCount++;
                    break;
                }
                j++;
            }
        }

        //display wins and losses
        int win = winCount;
        int lose = x- winCount;
        System.out.println("\nYou played the game " + x + " times");
        System.out.println("You won " + win + " times and got " + win + "$");
        System.out.println("You lost " + lose + " times and lost " + lose + "$");


        //Mean Count
        double mean = (double) winCount/x;
        System.out.println("The mean of the wins is: " + mean);

        //Variance count
        double wins = Math.pow((1 - mean), 2) * winCount;
        double losses = Math.pow((0 - mean), 2) * (x - winCount);
        double variance = (wins + losses) / x;
        System.out.println("Variance: " + variance);


        //Standard Deviation count
        double stde = sqrt(variance);
        System.out.println("Strandard Deviation: " + stde);
    }

    public static void main(String[] args){
        new SecondGame(1000000);
    }

    public int getWinCount() {
        return winCount;
    }

    private int dice1, dice2;
    private int winCount;
    private Random rnd = new Random();
}
