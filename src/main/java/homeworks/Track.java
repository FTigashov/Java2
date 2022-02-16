package homeworks;

public class Track extends Barrier {
    int length;
    public Track(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean move(Actions actions) {
        System.out.println("Дорожка " + super.getName() + " с расстоянием " + this.length);
        actions.jump();

        if (getLength() <= actions.getWallHeight()) {
            System.out.println("Пробежал");
            return true;
        }
        else {
            System.out.println("Не смог пробежать");
            return false;
        }
    }
}
