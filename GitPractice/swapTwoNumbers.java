// Swap two numbers input a=100 b=200
                 //   output a=200 b=100

package GitPractice;

public class swapTwoNumbers
{
    public static void main(String[] args)
    {
        int a=100;
        int b=200;
        System.out.println("Before swapping: a= "+a+ " and b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Before swapping: a= "+a+ " and b= "+b);

    }
}
