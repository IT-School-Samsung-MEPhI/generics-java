package example3;

public class Cat extends Animal implements Pettable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void pet() {
        System.out.println("meow");
    }
}
