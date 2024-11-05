package example3;

public class AnimalBox<T extends Animal> {
    private T animal;

    public AnimalBox(T item) {
        this.animal = item;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
