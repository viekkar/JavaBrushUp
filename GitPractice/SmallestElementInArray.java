package GitPractice;

public class SmallestElementInArray
{
    public static void main(String[] args) {
        int[] arr = new int[]{56, 45, 3, 85, 14};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];

            }
        }
        System.out.println("Smallest number in the given array : "+min);


    }
}
