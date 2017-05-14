import java.util.*;
class node12
{
    int n;node12 nxt;
    node12()//default constructor
    {
        n=0;nxt=null;
    }
    void getdata()//input number
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void display()//display
    {
        System.out.println(n);
    }
}//end of node2