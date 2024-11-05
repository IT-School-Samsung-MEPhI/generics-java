package example3;

public class Example3 {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        Dog dog = new Dog("dog");
        Coyote coyote = new Coyote("coyote");

        AnimalBox<Cat> box1 = new AnimalBox<>(cat);
        AnimalBox<Dog> box2 = new AnimalBox<>(dog);
        AnimalBox<Coyote> box3 = new AnimalBox<>(coyote);
        // Cactus cactus = new Cactus(13);
        // AnimalBox<Cactus> box3 = new AnimalBox<>(cactus); - Ошибка

        PettableAnimalBox<Cat> box4 = new PettableAnimalBox<>(cat);
        PettableAnimalBox<Dog> box5 = new PettableAnimalBox<>(dog);
        // PettableAnimalBox<Coyote> box6 = new PettableAnimalBox<>(coyote); - Ошибка
    }
}
