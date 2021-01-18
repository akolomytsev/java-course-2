package races;

public interface Run {

    void run(int distance); // Ссылается на оверрайд героя с выводом имени
    int getRunLimit(); // Данный геттер нужен для применения в методе take, возвращает значения для проверки возможности преодоления препятствия
}
