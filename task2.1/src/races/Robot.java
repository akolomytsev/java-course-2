package races;

public class Robot implements Activity{

    private final String name;
    private static int counter = 0;

    public Robot() {
        counter++;
        name = "Robot#" + counter;
    }

    @Override
    public void take(Obstacle... obstacles) {
        for (Obstacle obstacle : obstacles) {
            if (!obstacle.take(this)) {
                System.out.println(obstacle + " cannot be taken by " + name);
                return;
            }
        }
        System.out.println("All obstacles was taken by " + name);
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " jump to " + height + "m");
    }

    @Override
    public int getJumpLimit() {
        return 101;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " run " + distance + "m");
    }

    @Override
    public int getRunLimit() {
        return 101;
    }
}
