import java.util.*;
class Product_tree_nodes
{
    int k;
    node11 create(node11 s,node11 p)//tree creation using recursive
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
    void product(node11 rt)//calculate product of nodes
    {
        if(rt!=null)
        {
            product(rt.left);
            k=k*rt.n;
            product(rt.right);
        }
    }
    void main()//menu driven function
    {
        Scanner sc=new Scanner(System.in);
        k=1;int ch=0;node11 s=null;node11 p;
        do
        {
            System.out.println("1.Create tree");
            System.out.println("2.Product of tree nodes");
            System.out.println("3.Exit"+"\n"+"Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter numbers or enter zero to stop");
                while(true)
                {
                    p=new node11();
                    p.input();
                    if(p.n==0)
                        break;
                    s=create(s,p);
                }
                break;
                case 2:product(s);
                System.out.println("Product of nodes is "+k);
                break;
                default:System.out.println("Thank you");
            }
        }while(ch<3);
    }//end of main
}//end of product of nodes
/*
OUTPUT:-
1.Create tree
2.Product of tree nodes
3.Exit
Enter your choice
1
Enter numbers or enter zero to stop
5
6
4
8
2
7
9
3
1
0
1.Create tree
2.Product of tree nodes
3.Exit
Enter your choice
2
Product of nodes is 362880
1.Create tree
2.Product of tree nodes
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
      k         int         store product of nodes
      n         int         element of list
      ch        int         store user choice
      i         int         loop variable */