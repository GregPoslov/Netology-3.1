public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;//Стоимость билетов
        int miles = service.calculate(price);
        System.out.println("Количество бонусов: " + miles);
    }
}