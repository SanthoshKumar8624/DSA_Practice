package StringOps;
import java.util.LinkedHashMap;
import java.util.Map;
public class mapCount
{
    public static void main(String[] args)
    {
        String s="hi hi hello hi java hello";
        System.out.println(s);
        String [] s1=s.split(" ");
        Map<String,Integer> M=new LinkedHashMap<String,Integer>();
        for(String str :s1)
        {
            M.put(str,M.getOrDefault(str,0)+1);
        }
        M.forEach((Key, Value)->{
            System.out.println(Key+":"+Value);// lamba function to print values in map.
        });

    }
}
