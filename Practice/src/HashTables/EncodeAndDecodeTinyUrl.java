package HashTables;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class EncodeAndDecodeTinyUrl
{
    String Url="http://tinyurl.com/";
    Map<String,String> m=new HashMap<>();
    Random rand=new Random();
    int Klength=6;
    String c="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public String encode(String longUrl)
    {
        String key;
        do
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<Klength;i++)
            {
                sb.append(c.charAt(rand.nextInt(c.length())));
            }
            key=sb.toString();
        }
        while(m.containsKey(key));

        m.put(key,longUrl);
        return Url+key;
    }
    public String decode(String shortUrl)
    {
        String key=shortUrl.replace(Url,"");
        return m.get(key);
    }
    public static void main(String[] args) {
        EncodeAndDecodeTinyUrl x=new EncodeAndDecodeTinyUrl();
        String LongUrl="https://leetcode.com/problems/design-tinyurl";
        System.out.println("Long UrL: "+LongUrl);
        System.out.println("Encode(Short Url): "+x.encode(LongUrl));
        System.out.println("Decode(Long Url): "+x.decode(x.encode(LongUrl)));
    }
}
