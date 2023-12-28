public class CombinedGames {
    public static void main(String[] args) {
        FirstGame firstGame = new FirstGame(1000000);
        SecondGame secondGame = new SecondGame(1000000);

        int totalWins = getTotalWins(firstGame, secondGame);

        System.out.println("\nTotal Wins across both games: " + totalWins);
    }

    private static int getTotalWins(FirstGame firstGame, SecondGame secondGame) {
        int totalWins = firstGame.getWinCount() + secondGame.getWinCount();
        return totalWins;
    }
}
