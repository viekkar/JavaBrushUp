package StringPractice;

public class reverseWord
{
    public static void main(String[] args)
    {
        String str="my name is shraddha";
        System.out.println(str);
        String word[]=str.split(" ");
        for(int i=word.length-1;i>=0;i--)
        {
            System.out.print(word[i]+" ");
        }

    }
}
