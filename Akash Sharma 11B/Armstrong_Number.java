import java.util.*;
class Armstrong_Number
{
    int s,n;
    Armstrong_Number()
    {
        s=0;n=0;
    }//end of constructor
    int sum(int v,int x)  //finding sum of the cube of digits
    {
        x=x+((v%10)*(v%10)*(v%10));
        v=v/10;
        if(v>0)
            x=sum(v,x);
        return x;
    }//end of recursive sum()
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();     //input a number
        s=sum(n,s);         //calling sum()
        if(s==n)
            System.out.println("It is an Armstrong number");
        else
            System.out.println("It is not an Armstrong number");
    }//end of main()
}//end of Armstrong_Number

OUTPUT:-
Enter a number
153
It is an Armstrong number

VARIABLE LIST:-
    Variable    Type        Description
       n        int        to store a number 
       s        int        to store sum of cube of digits 
       x        int        to return sum 
       v        int        formal parameter to store a number