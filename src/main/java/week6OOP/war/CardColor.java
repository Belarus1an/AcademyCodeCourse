package week6OOP.war;

public enum CardColor {

    Clubs,
    Diamond,
    Hearts,
    Spades;

    private int value;

    CardColor() {

    }

    CardColor(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }
}
