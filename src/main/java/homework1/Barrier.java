package homework1;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean move(Actions actions);

    public String getName() {
        return name;
    }
}
