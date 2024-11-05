package example1;

public class DogBox {
    private Dog dog;
    private String tag;

    public DogBox(Dog dog, String tag) {
        this.dog = dog;
        this.tag = tag;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
