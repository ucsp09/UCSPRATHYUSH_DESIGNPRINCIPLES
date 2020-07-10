package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class UserInterface{
    private MathOperations obj;
    private List<String> operations;
    public UserInterface()
    {
        obj=new MathOperations();
        String temp[]=obj.getOperations().split("_");
        operations=new ArrayList<String>();
        operations=Arrays.asList(temp);
    }
    public void displayUI()
    {
        System.out.println("****************************");
        int i;
        for(i=0;i<operations.size();i++)
            System.out.println(i+1+"."+operations.get(i));
        System.out.println(i+1+"."+"Exit");
        System.out.println("Enter Your Choice:");
    }
    public boolean validateChoice(int choice)
    {
        if(choice==operations.size()+1)    
            System.exit(0);
        return choice>0&&choice<=operations.size();
    }
    public void executeChoice(int choice,double a,double b)
    {
        if(operations.get(choice-1).equals("Add"))
            System.out.println(obj.add(a,b));
        else if(operations.get(choice-1).equals("Subtract"))
            System.out.println(obj.sub(a,b));
        else if(operations.get(choice-1).equals("Multiply"))
            System.out.println(obj.mul(a,b));
        else if(operations.get(choice-1).equals("Divide"))
            System.out.println(obj.div(a,b));
        else
            ;
    }  
}