package races;

public class Route implements Obstacle{

    int length = (int) (Math.random()*100+1);// Генерим случайное число

    @Override
    public boolean take(Activity activity) {
        if (activity.getRunLimit() > length){ // Проверяем, если getRunLimit (число определяет возможность героя) больше length (сгенерированной дистанции)
        activity.run(length); // вызываем метод ран в активности и передаем туда длинну
         return true; // препятствие преодолено
        }
        return false;
    }

    @Override
    public String toString() {
        return "Route {" + "length =" + length + '}'; // Выводим в момент непреодоления препятствия (что именно не преодолели)
    }
}
