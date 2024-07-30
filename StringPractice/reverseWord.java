package StringPractice;

import java.util.Arrays;

public class reverseWord
{
    public static void main(String[] args)
    {
        String str="India is my country";
        System.out.println(str);
        String word[]=str.split(" ");
        for(int i=word.length-1;i>=0;i--)
        {
            System.out.print(word[i]+" ");
        }

    }
}
