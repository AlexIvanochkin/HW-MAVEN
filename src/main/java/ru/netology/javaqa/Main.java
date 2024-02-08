public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int amount = 700;
        long limit = 500;
        long bonus = service.calculate(amount, true);
        System.out.println("Ваш бонус " + bonus);

        amount = 500;
        limit = 500;
        bonus = service.calculate(amount, false);
        System.out.println("Ваш бонус " + bonus);
    }
}