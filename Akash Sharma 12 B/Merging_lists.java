import java.util.*;
class Merging_lists
{
    node7 p,s;
    Merging_lists()//default constructor
    {
        p=null;s=null;
    }
    void create()//create list
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No.of elements? ");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {   
            p=new node7();
            p.input();
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
    }
    void merge(node7 start)//merge 2 lists
    {
        node7 pt=s;
        while(pt.nxt!=null)
            pt=pt.nxt;
        pt.nxt=start;
    }
    void print()//print list
    {
        for(p=s;p!=null;p=p.nxt)
        {
            p.display();
        }
    }
    void main()
    {
        Merging_lists ob1=new Merging_lists();
        Merging_lists ob2=new Merging_lists();
        System.out.println("Create 1st list");
        ob1.create();
        System.out.println("Create 2nd list");
        ob2.create();
        ob1.merge(ob2.s);
        System.out.println("new list is...");
        ob1.print();
    }//end of main
}//end of Merging_lists
/*
OUTPUT:-
Create 1st list
No.of elements? 
3
Enter elements
bat
ball
cat
Create 2nd list
No.of elements? 
2
Enter elements
mat
hat
new list is...
cat
ball
bat
hat
mat

VARIABLE LIST:-
    Variable    Type        Description
      p         class       point current node
      pt        class       point current node of 1st list
      s         class       point last node
      x         String      element of list
      nxt       class       point next node
      n         int         no.of elements
*/