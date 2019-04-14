package week5OOP.zoo;

public class Bear extends Animal{

    private int furLenth;

    public Bear(String name, float weight, int furLenth) {
        super(name, weight);
        this.furLenth = furLenth;
    }

    @Override
    public void introduce() {
        System.out.println("I'm bear. My name is " + getName() + ". I weight " + getWeight() + " kg and may fur lenght is " + getFurLenth());
    }

    public int getFurLenth() {
        return furLenth;
    }

    public void setFurLenth(int furLenth) {
        this.furLenth = furLenth;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
