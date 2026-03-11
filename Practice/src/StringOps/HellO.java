package StringOps;

public class HellO {
    public static void main(String[] args) {
        String S = "hello world hi i";
        System.out.println(S);
        String [] A = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s: A)
        {
            if(s.length()==1)
            {
                sb.append((char)(s.charAt(0)-32));
                sb.append(" ");
            }
            else
            {
                sb.append((char)(s.charAt(0)-32));
                sb.append(s,1, s.length()-1);
                sb.append((char)(s.charAt(s.length()-1)-32));
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
