package week5OOP.zoo;

public class Dog extends Animal implements Cannie {

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void introduce() {
        System.out.println("I'm bear. My name is " + getName() + ". I weight " + getWeight() + " kg");
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }

    public void sitPretty(){
        System.out.println(getName() + " sits pretty");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //todo - aaaaa
}
