package test;
import src.UserInterface;
import java.util.Scanner;
public class Client {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean input=true;
        UserInterface obj=new UserInterface();
        int choice;
        while(input)
        {
            obj.displayUI();
            choice=sc.nextInt();
            if(obj.validateChoice(choice))
            {
                double a,b;
                System.out.println("Enter Two Space Seperated Numbers");
                a=sc.nextDouble();
                b=sc.nextDouble();
                obj.executeChoice(choice,a,b);
            }
            else
                System.out.println("!!!Please Enter a correct choice!!!");
        }
    }
}