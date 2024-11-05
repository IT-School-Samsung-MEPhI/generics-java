package example1;

public class CatBox {
    private Cat cat;
    private String tag;

    public CatBox(Cat cat, String tag) {
        this.cat = cat;
        this.tag = tag;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
