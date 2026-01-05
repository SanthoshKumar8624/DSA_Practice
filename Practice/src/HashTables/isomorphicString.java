package HashTables;
import java.util.HashMap;
import java.util.Map;
public class isomorphicString//205. Isomorphic Strings
{
    public static boolean isomorphicCheckbyMap(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            // Check mapping from s to t
            if (mapST.containsKey(charS)) {
                if (mapST.get(charS) != charT) return false;
            } else {
                mapST.put(charS, charT);
            }
            // Check mapping from t to s
            if (mapTS.containsKey(charT)) {
                if (mapTS.get(charT) != charS) return false;
            } else {
                mapTS.put(charT, charS);
            }
        }
        return true;
    }
    public static boolean isomorphicCheck(String a,String b)
    {
        int [] mapab=new int[127];
        int [] mapba=new int[127];
        for(int i=0;i<a.length();i++)
        {
            char charab=a.charAt(i);
            char charba=b.charAt(i);
            if(mapab[charab]!=mapba[charba])
            {
                return false;
            }
            mapab[charab]=i+1;
            mapba[charba]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        String a="paper";
        String b="title";
        System.out.println(isomorphicCheck(a,b));
        System.out.println(isomorphicCheckbyMap(a,b));
    }
}
