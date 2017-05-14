import java.util.*;
class node
{
    int n;node nxt;
    node()//default constructor
    {
        n=0;nxt=null;
    }
    void input()//to input
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void display()//to display
    {
        System.out.println(n);
    }
}//end of node