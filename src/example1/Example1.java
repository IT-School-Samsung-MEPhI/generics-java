package example1;

public class Example1 {
    public static void main(String[] args) {
        Cat cat = new Cat("cat1");
        Box<Cat> box1 = new Box<>(cat, "box1");

        Dog dog = new Dog("dog1");
        Box<Dog> box2 = new Box<>(dog, "box2");
    }
}
