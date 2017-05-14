import java.util.*;
class node6
{
    String x;node6 nxt;
    node6()//default constructor
    {
        x="empty";
    }
    void input()//to input a string
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string = ");
        x=sc.nextLine();
    }
    void display()//to display the string
    {
        System.out.println(x);
    }
}//end of node