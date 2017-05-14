import java.util.*;
class Happy_Number
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();//input a number
        int s=0,x=n;
        while(true)        //to find sum of square of the digits 
        {
            s=0;
            while(x!=0)
            {
                int ld=x%10;
                s=s+(ld*ld);
                x=x/10;
            }
            if(s<10)
            break;
            x=s;
        }
        if(s==1)
        System.out.println("It is a Happy number");
        else
        System.out.println("It is not a happy number");
    }//end of main()
}//end of Happy_Number
/*
OUTPUT:-
Enter a number
68
It is a Happy number

VARIABLE LIST:-
    Variable    Type        Description
      n         int        to store a number 
      s         int        to store sum  
      x         int        to store copy of number 
      ld        int        to store digits of the number
*/