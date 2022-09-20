import java.util.Scanner;

public class BonusMilesService {
    public int calculate(int cost) {
        Scanner not = new Scanner(System.in); //Сканер количества билетов
        System.out.println("Количество биллетов:");
        int numberOfTickets = not.nextInt(); // Количество билетов
        int bonusMiles = (cost * numberOfTickets) / 20;
        return bonusMiles;
    }
}
