public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1000000;
        int term = 12;
        double percentage = 9.99;
        int payment = service.calculate(loanAmount, term, percentage);
        System.out.println("Ежемесячный плетеж составляет: " + payment);


    }
}
