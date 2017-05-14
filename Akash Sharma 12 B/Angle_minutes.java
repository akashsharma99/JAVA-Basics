import java.io.*;
class Angle_minutes
{
    int degrees,minutes;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Angle_minutes()//default constructor
    {
        degrees=0;minutes=0;
    }
    void input()throws IOException//input angles
    {
        System.out.print("enter degrees = ");
        degrees=Integer.parseInt(br.readLine());
        System.out.print("enter minutes = ");
        minutes=Integer.parseInt(br.readLine());
    }
    Angle_minutes sum_angle(Angle_minutes a1,Angle_minutes a2)//calculate sum of angles
    {
        int g1=a1.degrees*60+a1.minutes;
        int g2=a2.degrees*60+a2.minutes;
        int sum=g1+g2;
        Angle_minutes ob=new Angle_minutes();
        ob.degrees=sum/60;
        ob.minutes=sum%60;
        return ob;
    }
    void display()//display sum of angles
    {
        System.out.println("The sum of angles is = "+degrees+" deg "+minutes+" mins");
    }
    void main()throws IOException//main function
    {
        Angle_minutes ob1=new Angle_minutes();
        Angle_minutes ob2=new Angle_minutes();
        Angle_minutes ob3=new Angle_minutes();        
        System.out.println("   1st ANGLE  ");
        ob1.input();
        System.out.println("   2nd ANGLE  ");
        ob2.input();
        ob3=ob3.sum_angle(ob1,ob2);
        ob3.display();
    }//end of main
}//end of Angle_minutes
/*
OUTPUT:-
   1st ANGLE  
enter degrees = 25
enter minutes = 59
   2nd ANGLE  
enter degrees = 25
enter minutes = 1
The sum of angles is = 51 deg 0mins

VARIABLE LIST:-
    Variable    Type        Description
     degrees    int         store degrees of angles
     minutes    int         store minutes of angle
     g1         int         1st angle in minutes
     g2         int         2nd angle in minutes
     sum        int         store sum of angles
*/