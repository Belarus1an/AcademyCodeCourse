package week6OOP.war;

public class ColorBattle implements IBattle {

    @Override
    public int checkWinner(Deck deck1, Deck deck2) {

        int win = 0;

        ColorBattle colorBattle = new ColorBattle();
        int color1 = colorBattle.colorValue(deck1);
        int color2 = colorBattle.colorValue(deck2);

        if (color1 > color2){
            System.out.println(color1);
            System.out.println(color2);
            win = 1;
        } if (color1 < color2){
            System.out.println(color1);
            System.out.println(color2);
            win = 2;
        } else {
            System.out.println("Remis");
            System.out.println(color1);
            System.out.println(color2);
        }
        return win;
    }

    private int colorValue(Deck deck){
        int sum = 0;
        for (Card card: deck.getCardList()){
            sum += card.getColor().getValue();
        }
        return sum;
    }
}
