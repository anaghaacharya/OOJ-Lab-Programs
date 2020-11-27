import java.util.*;
class myGen<a,b>{
    a obj1;
    b obj2;

  myGen(a obj1, b obj2)
  {
      this.obj1 = obj1;
      this.obj2 = obj2;
  }
  void Display()
  {
      System.out.println("Type of a is " +obj1.getClass().getName());
      System.out.println("Value: "+obj1);
      System.out.println("Type of b is " +obj2.getClass().getName());
      System.out.println("Value: "+obj2);
  }
 
}
public class lab7{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and age\n");
        String name=sc.nextLine();
        int age=sc.nextInt();
        myGen<String,Integer>myG1 = new myGen<String,Integer>(name,age);
        System.out.println("Enter a character and a double number\n");
        char ch=sc.next().charAt(0);  
        double db=sc.nextDouble();
        myGen<Character,Double>myG2 = new myGen<Character,Double>(ch,db);
        myG1.Display();
        myG2.Display();
    }
}