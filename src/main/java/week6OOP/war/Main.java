package week6OOP.war;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        RarityBattle rarityBattle = new RarityBattle();
        rarityBattle.checkWinner(createDeck(), createDeck());
        System.out.println();
        ColorBattle colorBattle = new ColorBattle();
        colorBattle.checkWinner(createDeck(), createDeck());

    }

    private static Deck createDeck(){

        List<Card> cardList = new ArrayList<>();

        int a = 0;

        for (int i = 0; i < 10; i++) {
           Card card = createRandomCard();
           cardList.add(card);
           if (card.isRare()){
               a++;
           }
        }

        Deck deck = new Deck(cardList);
        System.out.println("Rare cards " + a);

        return deck;
    }

    private static Card createRandomCard(){

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        int randomColorNumber = random.nextInt(4);
        CardColor cardColor = CardColor.values()[randomColorNumber];

        boolean isRare = random.nextBoolean();

        Card card = new Card(cardColor, randomNumber, isRare);
        System.out.println(card);

        return card;
    }

    private static void rarityBattle(Deck deck1, Deck deck2){


    }
}
