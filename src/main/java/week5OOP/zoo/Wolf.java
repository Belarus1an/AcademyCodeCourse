package week5OOP.zoo;

public class Wolf extends Animal implements Cannie {

    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    @Override
    public void introduce() {
        System.out.println("I'm bear. My name is " + getName() + ". I weight " + getWeight() + " kg and may fur lenght is " + getFangLength());
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }

    public int getFangLength() {
        return fangLength;
    }

    public void setFangLength(int fangLength) {
        this.fangLength = fangLength;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
