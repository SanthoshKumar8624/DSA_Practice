package LooseCoupling;

public class BookStore
{
    public PaymentGateway paymentGateway;
    public BookStore(PaymentGateway paymentGateway)
    {
        this.paymentGateway = paymentGateway;
    }
    public void purchase()
    {
        paymentGateway.payment();
        System.out.println("Book purchased");
    }
    public static void main(String[] args) {
        BookStore b1 = new BookStore(new Paytm()); //Constructor Injection and Runtime Polymorphism
        BookStore b2 = new BookStore(new Phonepe());
        b1.purchase();
        b2.purchase();
    }
}
