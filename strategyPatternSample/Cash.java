package strategyPatternSample;

public class Cash implements PaymentType{
    public String calculatePayment(){

        String output = new String();

        output += "Payment is Cash\n";
        output += "No incentives";

        return output;
    }
}