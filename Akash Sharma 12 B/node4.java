import java.util.*;
class node4
{
    int n;node4 nxt,prev;
    node4()//default constructor
    {
        n=0;nxt=null;prev=null;
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
}//end of node4