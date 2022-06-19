public class Main {
    public static void main(String[] args) {

        int amountTicket = 5;
        int costTicket = 5000;
        int orderAmount = (costTicket * amountTicket);
        int bonus = (orderAmount / 20);
        System.out.println("Hello! Thank you for choosing our airline for your flight. Your bonus is: " + bonus + " miles");

    }
}
