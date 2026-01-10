package simpleProgram;
import java.util.LinkedHashMap;
import java.util.Map;
public class FrequencyWord
{
    public static void count(String str)
    {
        String [] s=str.split(" ");
        Map<String,Integer> M= new LinkedHashMap<>();
        for(String str1:s)
        {
            M.put(str1,M.getOrDefault(str1,0)+1);
        }
        M.forEach((key,value)-> System.out.println(key+" : "+value));
    }
    public static void main(String[] args)
    {
        String str = "today is monday today";
        count(str);
    }
}
