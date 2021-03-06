import java.util.*;
class Binary_tree_searching
{
    node10 create(node10 s,node10 p)//tree creation using recursive
    {
        if(s==null)
        {
            s=p;return s;
        }
        if(p.n>s.n) //move right
        {
            s.right=create(s.right,p);
        }
        else        //move left
        {
            s.left=create(s.left,p);
        }
        return s;
    }
    int find(node10 rt,int data)//binary tree searching
    {
        int f=0;
        while(rt!=null&&f!=1)
        {
            if(data<rt.n)
                rt=rt.left;
            else if(data>rt.n)
                rt=rt.right;
            else
            {   
                f=1;break;
            }
            f=find(rt,data);
        }
        return(f);
    }
    void main()//menu driven function
    {
        Scanner sc=new Scanner(System.in);
        int k=0,ch=0;node10 s=null;node10 p;
        do
        {
            System.out.println("1.Create tree");
            System.out.println("2.Search a number");
            System.out.println("3.Exit"+"\n"+"Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter numbers or enter zero to stop");
                while(true)
                {
                    p=new node10();
                    p.input();
                    if(p.n==0)
                        break;
                    s=create(s,p);
                }
                break;
                case 2:System.out.println("Enter a number to search");
                k=sc.nextInt();
                if(find(s,k)==1)
                    System.out.println("Element is found");
                else
                    System.out.println("Element is not found");
                break;
                default:System.out.println("Thank you");
            }
        }while(ch<3);
    }//end of main
}//end of binary tree searching
/*
OUTPUT:-
1.Create tree
2.Search a number
3.Exit
Enter your choice
1
Enter numbers or enter zero to stop
45
55
35
67
25
40
18
77
22
24
75
0
1.Create tree
2.Search a number
3.Exit
Enter your choice
2
Enter a number to search
5
Element is not found
1.Create tree
2.Search a number
3.Exit
Enter your choice
2
Enter a number to search
25
Element is found
1.Create tree
2.Search a number
3.Exit
Enter your choice
3
Thank you

VARIABLE LIST:-
    Variable    Type        Description
      p         class       point current node
      left      class       point left node
      right     class       point right node
      s         class       point first node
      k         int         store count of nodes
      n         int         element of list
      ch        int         store user choice
      i         int         loop variable
*/