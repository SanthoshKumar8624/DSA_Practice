package StringOps;

public class practice
{
    public static void main(String[] args) //13/03/2026
    {

    }
}


//Find all the palindromic substrings in a given string and maxlength.
//public static void main(String[] args) {
//        String s = "abaab";
//        String result;
//        int max=0;
//        String maxpalidrome="";
//        System.out.println(s);
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j <= s.length(); j++) {
//                result = s.substring(i, j);
//                if (check(result) && result.length() > max){
//                    maxpalidrome=result;
//                    max=result.length();
//                }
//            }
//        }
//        System.out.println(maxpalidrome+"->"+max);
//    }
//
//    public static boolean check(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }