package Stacks;
import java.util.Stack;
public class WebHistory
{
    private Stack<String> forwardStack, backwardStack;
    private String currentPage;
    WebHistory()
    {
        backwardStack = new Stack<>();// stack1 for storing previous page
        forwardStack = new Stack<>();// stack2 for storing recent page
        currentPage = "currentPage";//  assigning currentPage
    }
    public void visitPage(String page)
    {
        backwardStack.push(currentPage);
        currentPage = page;
        forwardStack.clear();
    }
    public void previous()
    {
        forwardStack.push(currentPage);
        currentPage=backwardStack.pop();
    }
    public String currentPage()
    {
        return currentPage;
    }
    public static void main(String[] args){
        WebHistory w = new WebHistory();
        w.visitPage("facebook");//push currentPage to backwardStack
        w.visitPage("youtube");//push to facebook to backwardStack
        w.visitPage("amazon");//push to youtube to backwardStack
        w.previous();//push amazon to forwardStack
        System.out.println(w.currentPage());//now currentPage is youTube
    }
}
