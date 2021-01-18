package races;

public class Person implements Activity{

    private final String name;
    private static int counter = 0;
    private final int jumpLimit;
    private final int runLimit;

    public Person(int jumpLimit, int runLimit) { // Создаем метод для задания жесткого значения возможностей героя
        this.jumpLimit = jumpLimit; //
        this.runLimit = runLimit; //
        counter++; // Динамичный номер (+1 к каждому последующему)
        name = "Person#" + counter; // Объявляем статичное имя Person и дописываем динамичный счетчик
    }

    @Override
    public void jump(int height) { System.out.println(name + " jump to " + height + "m"); }

    @Override
    public int getJumpLimit() {return jumpLimit;}

    @Override
    public void run(int distance) { System.out.println(name + " run " + distance + "m"); }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public void take(Obstacle... obstacles) {
        for (Obstacle obstacle:obstacles){
            if (!obstacle.take(this)){
                System.out.println(obstacle + " cannot be taken by " + name);
                return;
            }
        }
        System.out.println("All obstacles was taken by " + name);
    }
}
