package Stacks;
import java.util.Stack;
public class ReverseString
{
    public static void reverseUsingStack(String a)
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            stack.push(c);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())//if stack is empty stop
        {
            sb.append(stack.pop());
        }
        System.out.println("Reversed: "+sb);
        // for(int i=0;i<a.length();i++) this will just print the pop element
        // {                                  so it looks like reversed string
        //     char top=stack.pop();
        //     char c=a.charAt(i);
        //     c=top;
        //     System.out.println(c);
        // }
    }
    public static void main(String[] args) {
        String s="java";
        System.out.println("String: "+s);
        reverseUsingStack(s);
    }
}