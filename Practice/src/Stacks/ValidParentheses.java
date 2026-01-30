package Stacks;

import java.util.Stack;

public class ValidParentheses
{
    public static boolean isValidParentheses(String str)
    {
        Stack<Character> stack=new Stack<>();//naresh
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char c=str.charAt(i);
            if(c=='('||c=='{'||c=='[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    char top=stack.pop();
                    if((c==')'&&top!='(')||(c=='}'&&top!='{')||(c==']'&&top!='['))
                    {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str="{([])}";
        System.out.println(str);
        System.out.println(isValidParentheses(str));
    }
}
