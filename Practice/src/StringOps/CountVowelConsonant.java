package StringOps;

public class CountVowelConsonant
{
    public static void main(String[] args) {
        String s="programming";
        System.out.println(s);
        int count=0;
        int vowel=0;
        int consonant=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowel++;
                count++;
            }
            else
            {
                consonant++;
                count++;
            }
        }
        System.out.println("vowel :"+vowel);
        System.out.println("consonant :"+consonant);
        System.out.println("Character count :"+count);
    }
}
