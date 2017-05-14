import java.io.*;
class Perfect_number
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,s,n;
    Perfect_number()
    {
        i=1;s=0;n=0;
    }//end of constructor
    int sum(int v)              //finding sum of factors
    {
        if(v%i==0)
        s=s+i;
        i++;
        if(i<v)
        s=sum(v);
        return s;
    }//end of recursive sum()
    void main()throws IOException
    {
        System.out.println("enter a number");       //input a number
        n=Integer.parseInt(br.readLine());
        s=sum(n);
        if(s==n)                    //check for perfect number
        System.out.println("Yes, it is a perfect number");
        else
        System.out.println("No, it is not a perfect number");
    }//end of main()
}//end of Perfect_number
/*
OUTPUT:-
enter a number
6
Yes, it is a perfect number

VARIABLE LIST:-
    Variable    Type        Description
       n        int        to store a number 
       s        int        to store sum of the factors 
       i        int        control variable 
       v        int        formal parameter for storing a number*/