package homework1;

import java.util.Random;

public class HomeApp {
    public static void main(String[] args) {
        int distance, height;
        boolean isRoad;

        Random random = new Random();
        Actions[] actions = new Actions[3];
        Barrier[] barriers = new Barrier[9];

        distance = random.nextInt(20);
        height = random.nextInt(10);
        actions[0] = new Human("Иван", distance, height);

        distance = random.nextInt(20);
        height = random.nextInt(10);
        actions[1] = new Cat("Васька", distance, height);

        distance = random.nextInt(20);
        height = random.nextInt(10);
        actions[2] = new Robot("Арнольд", distance, height);

        for (int i = 0; i < barriers.length; i++) {
            distance = random.nextInt(10);
            isRoad = random.nextBoolean();
            if (isRoad) {
                barriers[i] = new Track("Дорожка " + i, distance);
            } else {
                barriers[i] = new Wall("Стена " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].move(actions[i]);
                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("Успешно!");
            } else {
                System.out.println("Неудача!");
            }
        }
    }
}
