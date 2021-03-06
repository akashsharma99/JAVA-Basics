import java.util.*;
class Magic_square
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];
        int i,j,s=0,t=0,f=0;
        System.out.println("enter the elements");
        for(i=0;i<4;i++)            //input array
        {
            for(j=0;j<4;j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("The matrix is:-");
        for(i=0;i<4;i++)            //print array
        {
            for(j=0;j<4;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
            t=t+a[i][0];            //sum of 1st column
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
                s=s+a[i][j];        //check sum of each row
            if(t!=s)
                f=1;
            s=0;
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
                s=s+a[j][i];        //check sum of each column
            if(t!=s)
                f=1;
            s=0;
        }
        for(i=0;i<4;i++)        //check sum of 1st diagonal
            s=s+a[i][3-i];
        if(t!=s) f=1;
        s=0;
        for(i=0;i<4;i++)        //check sum of 2nd diagonal
            s=s+a[i][3-i];
        if(t!=s)
            f=1;
        if(f==0)
            System.out.println("It is a magic square");
        else
            System.out.println("It is not a magic square");
    }//end of main()
}//end of Magic_square
/*
OUTPUT:-
enter the elements
16
2
3
13
5
11
10
8
9
7
6
12
4
14
15
1
The matrix is:-
16	2	3	13	
5	11	10	8	
9	7	6	12	
4	14	15	1	
It is a magic square

VARIABLE LIST:-
    Variable    Type        Description
      a[][]     int        to store a double dimensional array 
      i         int        control variable 
      j         int        control variable 
      s         int        to store sum of elements 
      t         int        to store sum of 1st column 
      f         int        flag variable*/