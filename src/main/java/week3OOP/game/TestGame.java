package week3OOP.game;

import java.util.ArrayList;
import java.util.List;

public class TestGame {

    public static void main(String[] args) {

        Player player1 = new  Player("Jan", "Kulik", 100);
        Player player2 = new  Player("Pavel", "Samsonenka", 140);
        Player player3 = new  Player("Bob", "Sik", 56);

        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);

        Player.winner(playerList);

        Game game1 = new Game("WOT" , playerList.size());

    }

}
