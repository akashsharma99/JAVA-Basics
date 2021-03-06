import java.util.*;
class DoubleEnded_Stack
{
    node3 p,s;
    void push()//add node
    {
        p=new node3();
        p.input();
        if(s==null)
        {
            s=p;
            p.nxt=null;
            p.prev=null;
        }
        else
        {
            p.prev=s;
            p.nxt=null;
            s=p;
        }
    }
    void pop()//remove node
    {
        if(s==null)
            System.out.println("StackList empty");
        else
        {
            p=s;
            s=s.prev;s.nxt=null;
            p.prev=null;
        }
    }
    void print()//print element
    {
        for(p=s;p!=null;p=p.prev)
        {
            p.display();
        }
    }
    void main()//menu driven function
    {
        DoubleEnded_Stack obj=new DoubleEnded_Stack();
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("1.push...2.pop...3.print...4.exit");
            int h=sc.nextInt();
            if(h==1)
                obj.push();
            else if(h==2)
                obj.pop();
            else if(h==3)
                obj.print();
            else
                break;
        }
    }//end of main
}//end of DoubleEnded_Stack
/*
OUTPUT:-
1.push...2.pop...3.print...4.exit
1
Enter string = box
1.push...2.pop...3.print...4.exit
1
Enter string = cat
1.push...2.pop...3.print...4.exit
1
Enter string = mat
1.push...2.pop...3.print...4.exit
2
1.push...2.pop...3.print...4.exit
1
Enter string = hat
1.push...2.pop...3.print...4.exit
3
hat
cat
box
1.push...2.pop...3.print...4.exit
4

VARIABLE LIST:-
    Variable    Type        Description
      p         class       point current node
      s         class       point last node
      x         String      element of list
      prev      class       point previous node
      nxt       class       point next node
      h         int         store user choice
*/