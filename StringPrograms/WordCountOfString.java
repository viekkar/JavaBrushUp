package StringPrograms;

public class WordCountOfString
{
    public static void main(String[] args)
    {
        String words="Count no of words in a string";
        int countwords =words.split(" ").length;
        System.out.println("Count of words in the given string: "+countwords);

    }
}
