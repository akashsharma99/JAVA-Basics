import java.util.*;
class node9
{
    int n;node9 left;node9 right;
    node9()//default constructor
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