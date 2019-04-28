package week6OOP.war;

public class Card {

    private CardColor color;
    private int value;
    private boolean rare;

    public Card(CardColor color, int value, boolean rare) {
        this.color = color;
        this.value = value;
        this.rare = rare;
    }

    public CardColor getColor() {
        return color;
    }

    public boolean isRare() {
        return rare;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color=" + color +
                ", value=" + value +
                ", rare=" + rare +
                '}';
    }
}

