package GitPractice;        //input =0,1,1,2,3,5,8,13,21,34,55 etc

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        int num1=0, num2=1;

        for(int i=0;i<=10;i++)
        {
            System.out.print(num1+" ");
            int num3=num2+num1;
            num1=num2;
            num2=num3;

        }




    }
}
