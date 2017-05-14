import java.util.*;
class DoubleEnded_Queue
{
    node4 p,s,j;
    DoubleEnded_Queue()//default constructor
    {
        s=null;p=null;j=null;
    }
    void push()//add node
    {
        p=new node4();
        p.getdata();
        if(s==null)
        {
            s=p;
            p.nxt=null;p.prev=null;
            j=p;
        }
        else
        {
            j.nxt=p;
            p.nxt=null;p.prev=j;
            j=p;
        }
    }
    void pop()//remove node
    {
        if(s==null)
        {
            System.out.println("Empty queue");
        }
        else
        s=s.nxt;
    }
    void output()//display element
    {
        node4 x;
        for(x=s;x!=null;x=x.nxt)
        {
            x.display();
        }
    }
    void main()//menu driven function
    {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("1.push...2.pop...3.print...4.exit");
            int h=sc.nextInt();
            if(h==1)
                push();
            else if(h==2)
                pop();
            else if(h==3)
                output();
            else
                break;
        }
    }//end main
}//end of DoubleEnded_Queue
/*
OUTPUT:-
1.push...2.pop...3.print...4.exit
1
Enter number =5
1.push...2.pop...3.print...4.exit
1
Enter number =4
1.push...2.pop...3.print...4.exit
1
Enter number =3
1.push...2.pop...3.print...4.exit
2
1.push...2.pop...3.print...4.exit
1
Enter number =2
1.push...2.pop...3.print...4.exit
3
4
3
2
1.push...2.pop...3.print...4.exit
4

VARIABLE LIST:-
    Variable    Type        Description
       p        class       point current node
       s        class       point first node
       j        class       point last node
       nxt      class       point next node
       prev     class       point previous node
       n        int         store list element
       h        int         store user choice
*/