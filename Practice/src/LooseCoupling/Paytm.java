package LooseCoupling;

public class Paytm implements PaymentGateway
{
    @Override
    public void payment()
    {
        System.out.println("Payment by Paytm");
    }
}
