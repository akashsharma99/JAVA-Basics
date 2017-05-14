import java.io.*;
class Date
{
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    void main()throws IOException
    {
        String st="th";
        int m[]={31,0,31,30,31,30,31,31,30,31,30,31};
        String mm[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.print("Enter day number : ");
        int d=Integer.parseInt(br.readLine());       //input day number   
        if(d>365 || d<1)
            System.out.println("Wrong input!! try again");
        else
        {
            System.out.print("Enter year : ");       //input year
            int y=Integer.parseInt(br.readLine());
            if(y>9999)
                System.out.println("Wrong input!! try again");
            else
            {     
                System.out.print("Date after(N) : "); //input  date after(N)
                int n=Integer.parseInt(br.readLine());
                if(n>100 || n<1)
                    System.out.println("Wrong input!! try again");
                else
                {
                    int dt=d,t=0;
                    if(y%4==0)
                    { m[1]=29; t=366; }
                    else
                    { m[1]=28; t=365; }
                    int i=0;
                    while(dt>m[i])              //finding day and month
                    {
                        dt=dt-m[i];
                        i++;
                    }
                    if(dt%10==1 && dt!=11)      //finding subscript for day
                        st="st";
                    else if(dt%10==2 && dt!=12)
                        st="nd";
                    else if(dt%10==3 && dt!=13)
                        st="rd";
                    System.out.println(dt+st+" "+mm[i]+" "+y);
                    i=0;
                    dt=d+n;
                    if(dt>t)                //finding year for next date
                    {
                        y++;dt=dt-t;
                    }
                    if(y%4==0)
                        m[1]=29;
                    else
                        m[1]=28;
                    while(dt>m[i])          //finding new day and month
                    {
                        dt=dt-m[i];
                        i++;
                    }
                    st="th";
                    if(dt%10==1 && dt!=11)      //finding subscript for new day
                        st="st";
                    else if(dt%10==2 && dt!=12)
                        st="nd";
                    else if(dt%10==3 && dt!=13)
                        st="rd";
                    System.out.println("Date after "+n+" days: "+dt+st+" "+mm[i]+" "+y);
                }
            }
        }
    }//end of main()
}//end of Date

OUTPUT:-
Enter day number : 365
Enter year : 2007
Date after(N) : 60
31st December 2007
Date after 60 days: 29th February 2008

VARIABLE LIST:-
    Variable    Type        Description
       st       String     to add subscript to the day 
       m[]      int        to store days of the months 
       mm[]     String     to store name of months 
       d        int        to store day number 
       y        int        to store year 
       n        int        to store day after 
       dt       int        to store date 
       t        int        to store number of days in a year 
       i        int        to store month number