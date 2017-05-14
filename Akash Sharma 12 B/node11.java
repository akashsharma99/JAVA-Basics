import java.util.*;
class node11
{
    int n;node11 left;node11 right;
    node11()//default constructor
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