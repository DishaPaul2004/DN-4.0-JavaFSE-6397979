class Logger
{
    private static Logger instance;
    private Logger(){
        //private constructor of Logger class
    }
    public static Logger getInstance()
    {
        //public method to return an instance of Logger class
        if(instance==null)
        {
            //lazy initialization to prevent resource wastage
            instance=new Logger();
        }
        return instance;
    }
}
public class Demo
{
    public static void main(String args[])
    {
        Logger ob1=Logger.getInstance();
        Logger ob2=Logger.getInstance();
        System.out.println("Is the instance returned in ob1 same as that returned in ob2?");
        System.out.println(ob1==ob2);
    }
}
/*
OUTPUT
------------------------------------------------------------
Is the instance returned in ob1 same as that returned in ob2?
true
 */