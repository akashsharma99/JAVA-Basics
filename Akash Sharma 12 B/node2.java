import java.util.*;
class node2
{
    int n;node2 nxt;
    node2()//default constructor
    {
        n=0;nxt=null;
    }
    void getdata()//input number
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number =");
        n=sc.nextInt();
    }
    void display()//display
    {
        System.out.println(n);
    }
}//end of node2