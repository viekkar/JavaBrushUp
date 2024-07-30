package Practice;

public class paliendromeString
{
    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length() - 1;
        while (left < right)
        {
            if (str.charAt(left) != str.charAt(right))
            {
                return false;

            }
            left++;
            right--;

        }
        return true;
    }
     public static void main(String[] args)
     {
         String str="madam";
         String str1="hello";

         System.out.println(isPalindrome(str));
         System.out.println(isPalindrome(str1));
    }
}
