package example3;

public class Dog extends Animal implements Pettable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void pet() {
        System.out.println("woof");
    }
}