import java.util.*;
class node10
{
    int n;node10 left;node10 right;
    node10()//default constructor
    {
        n=0;left=null;right=null;
    }
    void input()//input number
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void display()//display number
    {
        System.out.println(n);
    }
}//end of node