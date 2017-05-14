import java.util.*;
class Powerful_number
{
    boolean prime(int x)//check prime
    {
        boolean f=true;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {f=false;break;}
        }
        return f;
    }//end of prime
    void main()//check powerful number
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();     //input number
        int flag=0;
        for(int p=2;p<a;p++)
        {
            if(prime(p)==true && a%p==0)//checking prime
            {
                if(a%(p*p)==0)//checking for powerful number
                {flag=1;}
                else if(a%(p*p)!=0)
                {flag=0;break;}
            }
        }
        if(flag==1|| a==1)
        System.out.println("It is a powerful number");
        else
        System.out.println("It is not powerful number");
    }//end of main
}//end of Powerful_number
/*
OUTPUT:-
Enter a number
128
It is a powerful number
Enter a number
20
It is not a powerful number

VARIABLE LIST:-
    Variable    Type        Description
      x         int         store prime number
      f         boolean     to return result of prime check
      i         int         loop variable
      flag      int         flag variable
      a         int         store powerful number
*/