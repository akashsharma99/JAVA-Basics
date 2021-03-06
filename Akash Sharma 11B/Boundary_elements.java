import java.util.*;
class Boundary_elements
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        System.out.println("Enter number of columns");
        int c=sc.nextInt();
        int i,j,r1,r2,c1,c2,k=0,x=r*c,min=0,p=0;
        int a[][]=new int[r][c];
        int b[]=new int[x];
        System.out.println("Enter the elements...");
        for(i=0;i<r;i++)        //input array
        {
            for(j=0;j<c;j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("Original array");
        for(i=0;i<r;i++)        //print original array
        {
            for(j=0;j<c;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        c1=0;c2=c-1;r1=0;r2=r-1;
        for(i=c1;i<=c2;i++)    //extracting boundary elements 
            b[k++]=a[r1][i];
        for(j=r1+1;j<=r2;j++)
            b[k++]=a[j][c2];
        for(i=c2-1;i>=c1;i--)
            b[k++]=a[r2][i];
        for(j=r2-1;j>=r1+1;j--)
            b[k++]=a[j][c1];
        for(i=0;i<k-1;i++)     //sorting boundary elements
        {
            min=i;
            for(j=i+1;j<k;j++)
            {
                if(b[j]<b[min])
                    min=j;
            }
            p=b[i];
            b[i]=b[min];
            b[min]=p;
        }
        k=0;
        for(i=c1;i<=c2;i++)//storing boundary elements in ascending order
            a[r1][i]=b[k++];
        for(j=r1+1;j<=r2;j++)
            a[j][c2]=b[k++];
        for(i=c2-1;i>=c1;i--)
            a[r2][i]=b[k++];
        for(j=r2-1;j>=r1+1;j--)
            a[j][c1]=b[k++];
        System.out.println("New array after sorting boundary elements");
        for(i=0;i<r;i++)        //print new array
        {
            for(j=0;j<c;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }        
    }//end of main()
}//end of Boundary_elements
/*
OUTPUT:-
Enter number of rows
3
Enter number of columns
4
Enter the elements...
19
16
12
4
7
8
16
45
20
1
48
6
Original array
19	16	12	4	
7	8	16	45	
20	1	48	6	
New array after sorting boundary elements
1	4	6	7	
48	8	16	12	
45	20	19	16	

VARIABLE LIST:-
    Variable    Type        Description
      r         int        number of rows of matrix 
      c         int        number of columns of matrix 
      i         int        control variable 
      j         int        control variable
      r1        int        1st change in row 
      r2        int        2nd change in row 
      c1        int        1st change in column 
      c2        int        2nd change in column 
      k         int        counter variable 
      x         int        product of row and column 
      min       int        to store minimum number 
      p         int        to swap elements 
      a[][]     int        to store double dimensional array 
      b[]       int        to store boundary elements*/