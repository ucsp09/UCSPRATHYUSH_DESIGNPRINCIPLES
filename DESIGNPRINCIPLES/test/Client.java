package test;
import src.*;
import java.util.*;
public class Client {
    public static void main(String[] args){
        boolean input=true;
        Scanner sc=new Scanner(System.in);
        int choice;
        double a,b;
        while(input)
        {
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            System.out.println("Choose your choice:");
            choice=sc.nextInt();
            if(choice==1||choice==2||choice==3||choice==4)
            {
                MathOperations obj=new MathOperations();
                System.out.println("Enter Two Space Seperated Numbers");
                a=sc.nextDouble();
                b=sc.nextDouble();
                if(choice==1)
                    System.out.println(obj.add(a,b));
                else if(choice==2)
                    System.out.println(obj.subtract(a,b));
                else if(choice==3)
                    System.out.println(obj.multiply(a,b));
                else
                    System.out.println(obj.divide(a,b));
            }
            else if(choice==5)
                input=false;
            else
                System.out.println("Please Enter a valid choice");
            System.out.println("***********************************");
        }
    }
}