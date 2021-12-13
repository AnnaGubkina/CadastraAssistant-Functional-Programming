import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static int RECOMMENDED_PRICE = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ground> plotOfLand = new ArrayList<>();

        while (true) {
            System.out.println("Введите цену за квадратный метр вашего участка");
            System.out.println("Для завершения введите -1");
            int input = scanner.nextInt();
            if (input == -1) {
                System.out.println("Нечестные сделки: ");
                filterDeals(plotOfLand);
                break;
            }
            generationPurchase(input, plotOfLand);
        }
    }

    public static void generationPurchase(int price, Collection<Ground> plotOfLand) {
        plotOfLand.add(new Ground(price));
    }

    //чистая функция
    public static void filterDeals(List<Ground> plotOfLand) {
        plotOfLand.stream()
                .filter(n -> n.getPrice() < RECOMMENDED_PRICE)
                .forEach(System.out::println);
    }
}
