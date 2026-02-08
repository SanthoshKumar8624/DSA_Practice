package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class FindFirstRepeatingElement
{
    public static void main(String[] args) {
        int[] a= {10,5,3,4,3,5,6};
        System.out.println(Arrays.toString(a));
        System.out.println("firstRepeatingElement: "+firstRepeatingElement(a));
    }
    public static int firstRepeatingElement(int[] a) {
        int result=-1;
        Set<Integer> set=new HashSet<>();
        for(int i=a.length-1;i>=0;i--){
            if(set.contains(a[i])){
                result=a[i];
            }
            else{
                set.add(a[i]);
            }
        }
        return result;
    }
}
