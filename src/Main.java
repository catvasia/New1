public class Main {
    public static void main(String[] args) {
        int amount = 18_000;
        int mile = 20;

        int bonus;
        if (amount > 20) {
            bonus = amount / 20;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый бонус: " + bonus);
    }
}

