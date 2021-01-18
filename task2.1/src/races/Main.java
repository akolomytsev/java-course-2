package races;

public class Main {
    public static void main(String[] args) {
        Activity[] persons = { // Массив участников
                new Person(40,50),
                new Person(70,30),
                new Person(100,100),
                new Cat(),
                new Cat(),
                new Robot(),
                new Robot()
        };
        /*Obstacle[] obstacles = { // Преодолеваемые препятствия
                new Wall(),
                new Route(),
                new Wall(),
                new Wall()
        };*/

        for (Activity person : persons){ // пробегаем каждым участником по каждому препятствию согласно
            person.take(new Wall(),new Route(),new Wall(),new Wall()); // Список преодолеваемых препятствий
        }
    }
}
