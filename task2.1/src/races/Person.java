package races;

public class Person implements Activity{ // Реализует интерфейс Activity

    private final String name; // объявленный экземпляр класса
    private static int counter = 0;  // объявленный и инициализированный экземпляр класса
    private final int jumpLimit;
    private final int runLimit;

    public Person(int jumpLimit, int runLimit) { // Создаем метод для задания жесткого значения возможностей героя
        this.jumpLimit = jumpLimit; //
        this.runLimit = runLimit; //
        counter++; // Динамический номер (+1 к каждому последующему)
        name = "Person#" + counter; // Присваеваем имя человеку и дописываем динамический счетчик
    }

    @Override
    public void jump(int height) { System.out.println(name + " jump to " + height + "m"); } // Выводит имя и высоту в консоль

    @Override
    public int getJumpLimit() {return jumpLimit;} // Возвращает значение человека с его возможностью к прыжкам

    @Override
    public void run(int distance) { System.out.println(name + " run " + distance + "m"); } //Выводит имя и дистанцию в консоль

    @Override
    public int getRunLimit() {
        return runLimit;
    } // Возвращает значение человека с его возможностью к бегу

    @Override
    public void take(Obstacle... obstacles) {
        for (Obstacle obstacle:obstacles){ // перемещаемся по всем препятствиям
            if (!obstacle.take(this)){ // Спрашиваем преодолено ли препятствие
                System.out.println(obstacle + " cannot be taken by " + name); // Выводим, если препятствие не преодолено
                return; // Завершаем программу для этого персонижа
            }
        }
        System.out.println("All obstacles was taken by " + name); // Выводим если все препятствия преодолены
    }
}
