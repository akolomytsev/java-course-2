package races;

public interface Obstacle {// интерфейс для определения возможности преодоления препятствия и передает его в Survival

    boolean take(Activity activity); // Возвращает приодолено ли препятствие
}
