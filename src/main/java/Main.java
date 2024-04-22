import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Программа запущена");

        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int N = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int M = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M + 1));
        }
        logger.log("Создаём и наполняем список");
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int f = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);

        logger.log("Программа завершена");
    }
}