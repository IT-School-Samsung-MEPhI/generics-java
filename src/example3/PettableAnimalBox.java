package example3;

public class PettableAnimalBox<T extends Animal & Pettable> {
    private T pettableAnimal;

    public PettableAnimalBox(T item) {
        this.pettableAnimal = item;
    }

    public T getPettableAnimal() {
        return pettableAnimal;
    }

    public void setPettableAnimal(T pettableAnimal) {
        this.pettableAnimal = pettableAnimal;
    }
}
