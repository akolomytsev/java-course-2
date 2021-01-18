package races;

public interface Jump {

    void jump(int height); //Ссылается на оверрайд героя с выводом имени
    int getJumpLimit(); // Данный геттер нужен для применения в методе take, возвращает значения для проверки возможности преодоления препятствия
}
