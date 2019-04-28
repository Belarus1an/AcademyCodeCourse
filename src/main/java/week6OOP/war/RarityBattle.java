package week6OOP.war;

public class RarityBattle implements IBattle{

    public int checkWinner(Deck deck1, Deck deck2){

        int win = 0;

        RarityBattle rarityBattle = new RarityBattle();
        int numberOfRareCards1 = rarityBattle.rareCard(deck1);
        int numberOfRareCards2 = rarityBattle.rareCard(deck2);

        if (numberOfRareCards1 > numberOfRareCards2){
            System.out.println("Win gracz numer 1");
            System.out.println(numberOfRareCards1);
            System.out.println(numberOfRareCards2);
            win = 1;
        } if (numberOfRareCards1 < numberOfRareCards2){
            System.out.println("Win gracz numer 2");
            System.out.println(numberOfRareCards1);
            System.out.println(numberOfRareCards2);
            win = 2;
        } else {
            System.out.println("Remis");
            System.out.println(numberOfRareCards1);
            System.out.println(numberOfRareCards2);
        }
        return win;

    }

    private int rareCard(Deck deck){
        int counter = 0;

        for (Card card: deck.getCardList()){
            if (card.isRare()){
                counter++;
            }
        }
        return counter;
    }
}
