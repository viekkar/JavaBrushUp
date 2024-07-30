package GitPractice;

public class SumOfArrayElements
{
    public static void main(String[] args)
    {
        int [] arr= new int[]{50,20,10,30,40};
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];


        }
        System.out.println("Sum of array elements are : "+sum);
    }
}
