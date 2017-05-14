import java.util.*;
class Count_tree_nodes
{
    node9 create(node9 s,node9 p)//tree creation using recursive
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
    int counter(node9 rt)//return count of nodes in tree
    {
        int c=0;
        if(rt==null)
        return(0);
        else
        {
            c=1;c=c+counter(rt.left);
            c=c+counter(rt.right);
            return(c);
        }
    }
    void main()//menu driven function
    {
        Scanner sc=new Scanner(System.in);
        int k=0,ch=0;node9 s=null;node9 p;
        do
        {
            System.out.println("1.Create tree");
            System.out.println("2.Count number of nodes");
            System.out.println("3.Exit"+"\n"+"Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter numbers or enter zero to stop");
                while(true)
                {
                    p=new node9();
                    p.input();
                    if(p.n==0)
                        break;
                    s=create(s,p);
                }
                break;
                case 2:k=counter(s);
                System.out.println("There are "+k+" nodes");
                break;
                default:System.out.println("Thank you");
            }
        }while(ch<3);
    }//end of main
}//end of counting nodes
/*
OUTPUT:-
1.Create tree
2.Count number of nodes
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
2.Count number of nodes
3.Exit
Enter your choice
2
There are 11 nodes
1.Create tree
2.Count number of nodes
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
      i         int         loop variable */