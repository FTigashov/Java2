package homeworks;

public class Human implements Actions {
    private String name;
    private int trackDistance;
    private int wallHeight;

    public Human(String name, int trackDistance, int wallHeight) {
        this.name = name;
        this.trackDistance = trackDistance;
        this.wallHeight = wallHeight;
    }


    @Override
    public void run() {
        System.out.printf("Человек по имени %s бежит дистанцию %d\n", this.name, this.getTrackDistance());
    }

    @Override
    public void jump() {
        System.out.printf("Человек по имени %s перепрыгивает стену высотой %d\n", this.name, this.getWallHeight());
    }

    @Override
    public int getTrackDistance() {
        return this.trackDistance;
    }

    @Override
    public int getWallHeight() {
        return this.wallHeight;
    }
}
