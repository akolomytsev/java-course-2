package races;

public class Cat implements Activity { // Реализует метод Activity

    private final String name; // объявленный переменный экземпляр класса
    private static int counter = 0; // объявленный и инициализированный переменный экземпляр класса

    public Cat(){
        counter++; // правило изменения счетчика
        name = "Cat#" + counter; //Объявляем имя Person и дописываем динамичный счетчик
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " jump to " + height + "m"); // Выводит имя и высоту в консоль
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " run " + distance + "m");// Выводит имя и дистанцию в консоль

    }

    @Override
    public int getRunLimit() {
        return 100; // Возвращает значение кота пробегать 100 м
    }

    @Override
    public int getJumpLimit() {
        return 100; // Возвращает значение кота перепрыгивать 100 м
    }

    @Override
    public void take(Obstacle... obstacles) { //
        for (Obstacle obstacle:obstacles){ // перемещаемся по всем препятствиям
            if (!obstacle.take(this)){ // Спрашиваем преодолено ли препятствие
                System.out.println(obstacle + " cannot be taken by " + name); // Выводим если препятствие не преодолено
                return;// Завершаем программу для этого персонижа
            }
        }
        System.out.println("All obstacles was taken by " + name); // Выводим если все препятствия преодолени
    }
}
