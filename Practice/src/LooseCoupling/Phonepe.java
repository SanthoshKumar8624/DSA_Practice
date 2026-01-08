package LooseCoupling;

public class Phonepe implements PaymentGateway
{
    @Override
    public void payment()
    {
        System.out.println("Payment by Phonepe");
    }
}
