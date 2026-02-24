package StringOps;
//Split the string into words and check if the first and last character of any word is vowel.
//Replace first letter with 2nd last and last letter with 2nd character.
public class sample1
{
    public static void main(String[] args) {
        String s="time java owl algo apple orange umbrella ice";
        System.out.println(s);
        String output=replaceVowel(s);
        System.out.println(output);
    }
    public static boolean isVowel(char c)
    {
        return c=='a' || c=='e'|| c=='i' || c=='o' ||c=='u';
    }
    public static String  replaceVowel(String s)
    {
        String [] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words)
        {
            if(word.length()>=3 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1)))
            {
                StringBuilder s1=new StringBuilder(word);

                char Secondchar=word.charAt(1);
                char SecondLast=word.charAt(word.length()-2);

                s1.setCharAt(0,SecondLast);
                s1.setCharAt(word.length()-1,Secondchar);

                result.append(s1.toString());
            }
            else
            {
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
