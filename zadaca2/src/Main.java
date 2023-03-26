public class Main {
    public static void main(String[] args) {

        int moneyInCashier = 100;
        int bill = 66;

        int bankNote1 = 20;
        int bankNote2 = 10;
        int bankNote3 = 2;
        int bankNote4 = 1;

        int change = moneyInCashier - bill;

        System.out.println("");

       //To be continued

        if (moneyInCashier > 100) {
            System.out.println("You have too much money!");
        }
        if (bill <= 0) {
            System.out.println("You didn't buy anything, did you?");
        }
        if (bill < 0) {
            System.out.println("Did you maybe break something.");


        }
    }

}