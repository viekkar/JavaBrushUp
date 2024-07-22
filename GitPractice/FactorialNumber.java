package GitPractice;        // input 5! output 5!=5*4*3*2*1 =125


import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial number of "+num+" is "+fact);

    }
}
