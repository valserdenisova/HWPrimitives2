public class Main {
    public static void main(String[] args) {
        int origAmount = 150;
        int amount = 120;
        int oneBonus = 100;
        int Bonus = amount / oneBonus;
        int amountWithoutBonus = origAmount + amount;
        int amountWithBonus = amountWithoutBonus + Bonus;

        if (amount > 1000) {
            System.out.println("Сумма бонуса = " + Bonus);
            System.out.println("Итоговая сумма = " + amountWithBonus);
        } else {
            System.out.println("Cумма бонуса = 0");
            System.out.println("Итоговая сумма = " + amountWithoutBonus);
        }
    }
}
