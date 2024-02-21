public class Main {
    public static void main(String[] args) {
        int balans = 85;
        int payment = 1500;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int chek = balans + payment + bonus;


        System.out.println("Итоговый баланс: " + chek + " Итого бонус: " + bonus);
    }
}
