package ArrayPractice;

public class largestNumberAnArray
{
    public static void main(String[] args) {
        int arr[]=new int[]{56,86,45,96,125,652,1,56};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];

            }
        }
        System.out.println(max);
    }
}
