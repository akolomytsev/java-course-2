package races;

public class Wall implements Obstacle{

    int height = (int) (Math.random()*100 + 1); // Генерим случайное число

    @Override
    public boolean take(Activity person) {
        if (person.getJumpLimit() > height) { //Проверяем, если getJumpLimit (число определяет возможность героя) больше length (сгенерированной высоты)
            person.jump(height); // вызываем метод Wall в активности и передаем туда высоту
            return true; // препятствие преодолено
        }else {
            return false; //если препятствие не преодолено
        }
    }

    @Override
    public String toString() {
        return "Wall {" + "height =" + height + '}';
    }// Выводим в момент непреодоления препятствия (что именно не преодолели)
}
