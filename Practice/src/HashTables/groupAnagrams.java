package HashTables;

import java.util.*;

public class groupAnagrams//49. Group Anagrams
{
    public static void groupAnagram1(String [] s) {
        Map<String, List<String>> m = new HashMap<>();
        for (String word : s) {
            char[] a = word.toCharArray();
            Arrays.sort(a);// to sort key
            String key = new String(a);
            m.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        for (Map.Entry<String, List<String>> entry : m.entrySet()) {
            System.out.println("Key (sorted form): " + entry.getKey()+ " → Values: " + entry.getValue());
        }
    }
    public static List<List<String>> groupAnagram2(String[] strs)
    {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs)
        {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;// typecasting occurs here
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq)
            {
                keyBuilder.append('#').append(count);// Example: [1,0,2] → "#1#0#2" #->used to avoid ambiguity
            }
            String key = keyBuilder.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args)
    {
        String [] a={"eat","tea","tan","ate","nat","bat"};
        groupAnagram1(a);//by sorting the key
        System.out.println(groupAnagram2(a));//by frequency count key
    }
}
