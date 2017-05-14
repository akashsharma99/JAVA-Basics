import java.util.*;
class Anticlockwise_Matrix
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m[][]=new int[16][16],x,step;
        int n;
        System.out.println("Enter a number");        //accept row/column number
        n=sc.nextInt();
        int count=1,i=n/2,j=(n-1)/2;
        for(step=1;step<n;step++)       //storing anticlockwise matrix
        {
            for(x=0;x<step;x++)
            {
                m[i][j]=count++;
                if(step%2==1)
                j++;
                else
                j--;
            }
            for(x=0;x<step;x++)
            {
                m[i][j]=count++;
                if(step%2==1)
                i--;
                else
                i++;
            }
        }
        for(x=0;x<n;x++)
        {
            m[i][j]=count++;
            if(n%2==1)
            j++;
            else
            j--;
        }
        System.out.println("Anticlockwise matrix is:-");
        for(i=0;i<n;i++)        //print matrix
        {
            for(j=0;j<n;j++)
            System.out.print(m[i][j]+"\t");
            System.out.println();
        }
    }//end of main()
}//end of Anticlockwise_Matrix
/*
OUTPUT:-
Enter a number
3
Anticlockwise matrix is:-
5	4	3	
6	1	2	
7	8	9	

VARIABLE LIST:-
    Variable    Type        Description
     m[][]      int        to store a matrix 
       x        int        control variable 
      step      int        control variable 
       n        int        to store number of rows or columns 
     count      int        to store elements in the matrix 
       i        int        row number 
       j        int        column number */