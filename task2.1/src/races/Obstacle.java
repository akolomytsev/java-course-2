package races;

public interface Obstacle {// метод для определения возможности преодоления

    boolean take(Activity activity); // Выбирает каким образом преодолевается препятствие через Activity
}
