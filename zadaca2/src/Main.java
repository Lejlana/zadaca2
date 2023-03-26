public class Main {
    public static void main(String[] args) {

        int moneyInCashier = 100;
        int bill = 66;

        int bankNote1 = 20;
        int bankNote2 = 10;
        int bankNote3 = 2;
        int bankNote4 = 1;

        int change = moneyInCashier - bill;

        System.out.println("The change is " + change);

        int apoen20 = change / bankNote1;
        System.out.println("20 KM = " + apoen20);

        int apoen10 = (change - (apoen20 * bankNote1)) / bankNote2;
        System.out.println("10 KM = " + apoen10);

        int apoen2 = (change - ((apoen20 * bankNote1) + (apoen10 * bankNote2))) / bankNote3;
        System.out.println("2 KM = " + apoen2);

        int apoen1 = (change - ((apoen20 * bankNote1) + (apoen10 * bankNote2) + (apoen2 * bankNote3))) / bankNote4;
        System.out.println("1 KM = " + apoen1);

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