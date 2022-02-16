package homeworks;

public class Wall extends Barrier {
    int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected boolean move(Actions actions) {
        System.out.println("Стена " + super.getName() + " размером " + this.height);
        actions.jump();

        if (getHeight() <= actions.getWallHeight()) {
            System.out.println("Перепрыгнул");
            return true;
        }
        else {
            System.out.println("Не смог перепрыгнуть");
            return false;
        }
    }
}
