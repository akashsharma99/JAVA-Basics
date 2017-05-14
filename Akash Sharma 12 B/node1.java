import java.util.*;
class node1
{
    String x;node1 nxt;
    node1()//default constructor
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