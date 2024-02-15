package strategyPatternSample;

public class Gcash implements PaymentType {
    public String calculatePayment(){

        String output = new String();

        output += "Payment is Gcash\n";
        output += "Energy for trees: 10 points";

        return output;
    }
}