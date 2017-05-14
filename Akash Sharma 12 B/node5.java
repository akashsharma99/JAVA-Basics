import java.util.*;
class node5
{
    String x;node5 nxt;
    node5()//default constructor
    {
        x="empty";
    }
    void input()//to input a string
    {
        Scanner sc=new Scanner(System.in);
        x=sc.nextLine();
    }
    void display()//to display the string
    {
        System.out.println(x);
    }
}//end of node