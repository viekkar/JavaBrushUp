package StringPrograms;

public class StringPalindrome
{


    public static boolean isPaliendrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while (left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {

                return false;

            }
            left ++;
            right --;

        }
        return true;
    }

    public static void main(String[] args) {
        String str1="level";
        String str2="hello";

        System.out.println(str1 + " is a palindrome: " + isPaliendrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPaliendrome(str2));
    }
}
//