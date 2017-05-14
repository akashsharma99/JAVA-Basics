import java.util.*;
class Delete_any_node
{
    node5 p,s;
    Delete_any_node()//default constructor
    {
        p=null;s=null;
    }
    void push()//add node
    {
        p=new node5();p.input();
        if(s==null)
        {
            s=p;
            p.nxt=null;
        }
        else
        {
            p.nxt=s;
            s=p;
        }
    }
    void print()//print list
    {
        for(p=s;p!=null;p=p.nxt)
        {
            p.display();
        }
    }
    void main()//menu driven function
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Create list, enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter words");
        for(int i=1;i<=n;i++)
            push();
        System.out.println("enter position number to delete,Zero being the last input");
        int k=sc.nextInt();
        if(k==0)
           s=s.nxt;    
        else
        {
            int c=0;              //to delete node at position 'k'
            p=s;node5 pt=s;
            while(c<k)
            {
                pt=p;
                p=p.nxt;
                c++;
            }
            pt.nxt=p.nxt;
            p.nxt=null;  p=null;  pt=null;
        }
        System.out.println("new stack is...");//print new list
        print();
    }//end of main
}//end of SingleEnded_Stack
/*
OUTPUT:-
Create list, enter number of elements
5
Enter words
rohan
is
a
good
boy
enter position number to delete,Zero being the last input
3
new stack is...
boy
good
a
rohan

VARIABLE LIST:-
    Variable    Type        Description
      p         class       point current node
      pt        class       point previous node
      s         class       point last node
      x         String      element of list
      nxt       class       point next node
      h         int         store user choice
      k         int         store position to delete
      c         int         control variable
*/