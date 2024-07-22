package GitPractice;        //input 12321  output 12321

public class ReverseAndPalindromeNumber
{
    public static void main(String[] args)
    {
        int num=12321;
        int rev=0;
        int temp=num;
        int rem;
        System.out.println("Input number is :"+num);
        while(num>0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse number is :"+rev);

    }
}
