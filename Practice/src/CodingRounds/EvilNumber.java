package CodingRounds;

public class EvilNumber
{
    public static void main(String[] args) {
        int n = 7;
        if (isEvil(n)) {
            System.out.println(n + " is an Evil number.");
        } else {
            System.out.println(n + " is not an Evil number.");
        }
    }
    public static boolean isEvil(int n) {
        int count = 0;
        while (n > 0) {
            if(n%2==1)
            {
                count++;
            }
            n = n/2;
        }
        return count % 2 == 0;
    }
}
