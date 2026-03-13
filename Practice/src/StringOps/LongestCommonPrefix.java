package StringOps;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight", "free"};
        System.out.println(Arrays.toString(s));
        String prefix = s[0];//flower
        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0)// flow.indexOf(flower)=-1 cause no match if match it will be 0.
            {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }
}
