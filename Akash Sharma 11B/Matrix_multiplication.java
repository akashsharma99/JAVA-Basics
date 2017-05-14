import java.io.*;
class Matrix_multiplication
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        int x=0,y=0,k=0,sum=0;
        System.out.print("Enter 1st matrix row number - ");
        int r1=Integer.parseInt(br.readLine());
        System.out.print("Enter 1st matrix column number - ");
        int c1=Integer.parseInt(br.readLine());
        int m1[][]=new int[r1][c1];
        System.out.println("Enter elements of 1st matrix");
        for(x=0;x<r1;x++)       //input 1st matrix
        {
            for(y=0;y<c1;y++)
                m1[x][y]=Integer.parseInt(br.readLine());
        }
        System.out.print("Enter 2nd matrix row number - ");
        int r2=Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd matrix column number - ");
        int c2=Integer.parseInt(br.readLine());
        int m2[][]=new int[r2][c2];
        System.out.println("Enter elements of 2nd matrix");
        for(x=0;x<r2;x++)       //input 2nd matrix
        {
            for(y=0;y<c2;y++)
                m2[x][y]=Integer.parseInt(br.readLine());
        }
        if(r2!=c1)
            System.out.println("Matrix multiplication not possible.");
        else    
        {   
            System.out.println("1st matrix:");
            for(x=0;x<r1;x++)       //print 1st matrix
            {
                for(y=0;y<c1;y++)
                    System.out.print(m1[x][y]+"\t");
                System.out.println();
            }
            System.out.println("2nd matrix:");
            for(x=0;x<r2;x++)       //print 2nd matrix
            {
                for(y=0;y<c2;y++)
                    System.out.print(m2[x][y]+"\t");
                System.out.println();
            }
            int result[][]=new int[r1][c2];
            for(x=0;x<r1;x++)   //multiply 2 matrices
            {
                for(y=0;y<c2;y++)
                {
                    for(k=0;k<r2;k++)
                    {
                        sum=sum+m1[x][k]*m2[k][y];
                    }
                    result[x][y]=sum;
                    sum=0;
                }
            }
            System.out.println("Resultant matrix:");
            for(x=0;x<r1;x++)//print final result
            {
                for(y=0;y<c2;y++)
                    System.out.print(result[x][y]+"\t");
                System.out.println();
            }
        }
    }//end of main()
}//end of Matrix_multiplication

OUTPUT:-
Enter 1st matrix row number - 2
Enter 1st matrix column number - 3
Enter elements of 1st matrix
1
2
4
3
9
9
Enter 2nd matrix row number - 3
Enter 2nd matrix column number - 2
Enter elements of 2nd matrix
0
1
1
4
5
8
1st matrix:
1	2	4	
3	9	9	
2nd matrix:
0	1	
1	4	
5	8	
Resultant matrix:
22	41	
54	111	

VARIABLE LIST:-
    Variable    Type        Description
       x        int        control variable 
       y        int        control variale 
       k        int        common row and column 
       sum      int        sum of products of corresponding elements 
       r1       int        number of rows of 1st matrix 
       c1       int        number of columns of 1st matrix 
       r2       int        number of rows of 2nd matrix 
       c2       int        number of columns of 2nd matrix 
       m1[][]   int        to store 1st matrix 
       m2[][]   int        to store 2nd matrix
     result[][] int        to store resultant matrix  
