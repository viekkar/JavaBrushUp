package GitPractice;

import java.util.Scanner;

public class EvenOddNumber
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Given number is Even number");
        }
        else
        {
            System.out.println("Given number is Odd number");


        }
    }
}
