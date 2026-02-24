package Reverse;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Welcome Dotnet".toLowerCase();
        String[] s1 = s.split(" ");
        System.out.println(s);
        for (int i = s1.length-1; i >=0; i--) {
            System.out.print(revWord(s1[i]));
        }
        revWord(s);
    }
    public static String revWord(String s) {
        String result = " ";
        for(int i=s.length()-1;i>=0;i--)
        {
            result += s.charAt(i);
        }
        return result;//shame on you
    }
}
