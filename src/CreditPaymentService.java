public class CreditPaymentService {
public int calculate(int loanAmount, int term, double percentage) {
    double coefficient;
    double monthlyPercentage = percentage / 12 / 100;
    coefficient = (monthlyPercentage * Math.pow((1 + monthlyPercentage), term)) / (Math.pow((1 + monthlyPercentage), term) - 1);
    double monthlyPaymentFormula = loanAmount * coefficient;
    int monthlyPayment = (int) (monthlyPaymentFormula);
    return monthlyPayment;
}
}
