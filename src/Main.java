public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        System.out.println(balance + refill);
        int bonus = 1;
        if (refill >= 1000) {
            System.out.println(balance + refill + (refill / 100 * bonus));
        } else {
            System.out.println(balance + refill);
        }


    }g
}
