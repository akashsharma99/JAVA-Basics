import java.util.*;
class Frequency_of_digits
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();     //input number
        int v=0,c=0;
        System.out.println("Number"+"\t"+"\t"+"Frequency");
        for(int i=0;i<=9;i++)   //finding frequency of digits
        {
            v=n;c=0;
            while(v>0)
            {
                int d=v%10;
                if(d==i)
                c++;
                v=v/10;
            }
            if(c>0)
            System.out.println(i+"\t"+"\t"+c);
        }
    }//end of main()
}//end of Frequency_of_digits

OUTPUT:-
Enter a number
2513233
Number      Frequency   
1           1
2           2
3           3
5           1

VARIABLE LIST:-
    Variable    Type        Description
      n         int        to store a number 
      v         int        to store copy of number 
      c         int        to store frequency of number 
      i         int        control variable 
      d         int        to store digits of the number 