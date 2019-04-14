package week5OOP.zoo;

public class Tiger extends Animal {

    private int clawLenght;

    public Tiger(String name, float weight, int clawLenght) {
        super(name, weight);
        this.clawLenght = clawLenght;
    }

    @Override
    public void introduce() {
        System.out.println("I'm bear. My name is " + getName() + ". I weight " + getWeight() + " kg and may fur lenght is " + getClawLenght());
    }

    public int getClawLenght() {
        return clawLenght;
    }

    public void setClawLenght(int clawLenght) {
        this.clawLenght = clawLenght;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
