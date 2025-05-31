public class Robot {

    private Direction dir;
    private int x, y;

    public Robot() {
        this(Direction.UP);
    }

    public Robot(Direction dir) {
        this.dir = dir;
        x = 0;
        y = 0;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        dir = Direction.LEFT;
        System.out.println("turn left");
    }

    public void turnRight() {
        dir = Direction.RIGHT;
        System.out.println("turn right");
    }

    public void turnDown() {
        dir = Direction.DOWN;
        System.out.println("turn down");
    }

    public void turnUp() {
        dir = Direction.UP;
        System.out.println("turn up");
    }

    public void stepForward() {
        switch (dir) {
            case DOWN: --y;
                break;
            case UP: ++y;
                break;
            case LEFT: --x;
                break;
            case RIGHT: ++x;
                break;
        }
        System.out.println("step: " + dir);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "dir=" + dir +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
