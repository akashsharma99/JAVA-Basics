import java.io.*;
class Automorphic_number
{
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    void main()throws IOException
    {
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());  //input a number
        String a=String.valueOf(n);
        String b=String.valueOf(n*n);           //square the number
        int at=a.length();
        int bt=b.length();
        String c=b.substring(bt-at);
        if(c.equals(a))                         //check automorphic
        System.out.println("Yes it is an Automorphic number");
        else
        System.out.println("It is not an Automorphic number");
    }//end of main()
}//end of Automorphic_number

OUTPUT:-
Enter a number
25
Yes it is an Automorphic number

VARIABLE LIST:-
    Variable    Type        Description
      n         int        to store a number 
      a         String     to store number as string 
      b         String     to store square of number
      at        int        to store length of string a
      bt        int        to store length of string b 
      c         String     to store digits of the square 