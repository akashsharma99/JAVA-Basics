import java.io.*;
class Kaprakar_number
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Enter a number");
        int n=Integer.valueOf(br.readLine);              //Input a number
        String st=String.valueOf(n*n);
        int c=st.length();
        String s1=st.substring(0,c/2);
        String s2=st.substring(c/2);
        int n1=Integer.valueOf(s1);
        int n2=Integer.valueOf(s2);
        int sum=n1+n2;
        if(sum==n)                            //check for kaprakar
        System.out.println("Yes it is a kaprakar number");
        else
        System.out.println("No it is not a kaprakar number");
    }//end of main()
}//end of Kaprakar_number

OUTPUT:-

Enter a number
45
Yes it is a kaprakar number

VARIABLE LIST:-
    Variable    Type        Description
      n         int        to store a number 
      st        String     to store square of number 
      c         int        to store number of digits 
      s1        String     to store 1st half 
      s2        String     to store 2nd half 
      n1        int        to store integer value of 1st half 
      n2        int        to store integer value of 2nd half 
      sum       int        to store sum of two halves 