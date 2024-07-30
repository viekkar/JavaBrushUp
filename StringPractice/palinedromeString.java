package StringPractice;

public class palinedromeString
{
    public static boolean isPaliendrome(String str)
    {
        int left=0;
        int right= str.length()-1;
        while (left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="level";
        System.out.println(isPaliendrome(str));
    }
}
