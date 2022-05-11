public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;

        if (replenishment >= 1000) {
            balance = balance + bonus + replenishment;
        } else {
            balance = balance + replenishment;
        }
        System.out.println(balance);
    }
}