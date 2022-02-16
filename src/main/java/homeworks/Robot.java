package homeworks;

public class Robot implements Actions {
    private String name;
    private int trackDistance;
    private int wallHeight;

    public Robot(String name, int trackDistance, int wallHeight) {
        this.name = name;
        this.trackDistance = trackDistance;
        this.wallHeight = wallHeight;
    }

    @Override
    public void run() {
        System.out.printf("Робот %s бежит дистанцию %d\n", this.name, this.getTrackDistance());
    }

    @Override
    public void jump() {
        System.out.printf("Робот %s прыгает в высоту %d\n", this.name, this.getTrackDistance());
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
