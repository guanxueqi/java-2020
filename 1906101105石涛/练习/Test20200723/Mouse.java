package Test20200723;

public class Mouse extends Animal {
    private String name;
    private int id;

    public Mouse(String name, int id, String name1, int id1) {
        super(name, id);
        this.name = name1;
        this.id = id1;
    }
}
