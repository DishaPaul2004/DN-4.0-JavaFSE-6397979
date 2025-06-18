import java.util.*;
class financialForecast
{
    public static double findFutureValue(double presentValue, double growthRate, int years)
    {
        if(years==0)
        return presentValue;
        else
        return findFutureValue(presentValue*(1+growthRate), growthRate, years-1);
    }
}
class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the present value of the money : ");
        double presentValue=sc.nextDouble();
        System.out.print("Enter the growth rate : ");
        double growthRate=sc.nextDouble();
        System.out.print("Enter the number of years ahead of which the value should be forecasted : ");
        int years=sc.nextInt();
        double futureValue=financialForecast.findFutureValue(presentValue, growthRate/100, years);
        System.out.println("Future value of the money is : "+Math.round(futureValue));
        sc.close();
    }
}
/*
OUTPUT
-----------------------------------------------------------------------------
Enter the present value of the money : 500
Enter the growth rate : 2
Enter the number of years ahead of which the value should be forecasted : 4
Future value of the money is : 541.21608
 */