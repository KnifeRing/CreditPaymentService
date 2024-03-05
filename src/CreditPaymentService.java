public class CreditPaymentService {

    public int calculate(int total, int years, double percent){
        double monthlyPercent = percent / (12*100); // месячная процентная ставка 12 это - кол-во
                                                    // месяцев, 100 процент
        double Month = years * 12; // общее кол-во месяцев

        double monthlyPayment = total * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, - Month));

        return (int) monthlyPayment;
    }
}