import java.util.*;
class Ascending_digits
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number"); 
        int n=sc.nextInt();     //input number
        int v=0;
        System.out.println("Digits in ascending order are");
        for(int x=0;x<=9;x++)   //printing digits in ascending order
        {
            v=n;
            while(v>0)
            {
                int d=v%10;
                if(d==x)
                System.out.print(x);
                v=v/10;
            }
        }
    }//end of main()
}//end of Ascending_digits

OUTPUT:-
Enter a number
654254
Digits in ascending order are
244556

VARIABLE LIST:-
    Variable    Type        Description
      n         int        to store a number 
      v         int        to store copy of number 
      x         int        control variable 
      d         int        to store digits of the number
