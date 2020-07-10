package src;
public class MathOperations{
    private String[] operations={"Add","Subtract","Multiply","Divide"};
    public double add(double a,double b)
    {
        return a+b;
    }
    public double sub(double a,double b)
    {
        return a-b;
    }
    public double mul(double a,double b)
    {
        return a*b;
    }
    public double div(double a,double b)
    {
        return a/b;
    }
    public String getOperations()
    {
        String str="";
        for(int i=0;i<operations.length;i++)
            str=str+operations[i]+"_";
        return str;
    }
}