package example1;

/**
 * T - тип
 * N - число
 * K - ключ
 * E - элемент
 * V - значение
 */
public class Box<T> {
    private T item;
    private String tag;

    public Box(T item, String tag) {
        this.item = item;
        this.tag = tag;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
