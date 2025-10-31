package Encapsulation;

class gmail
{
    private String password="ssk";
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
}
public class getset
{
    public static void main(String[] args) {
        gmail g=new gmail();
        System.out.println(g.getPassword());
        g.setPassword("ssk123");
        System.out.println(g.getPassword());
    }
}
