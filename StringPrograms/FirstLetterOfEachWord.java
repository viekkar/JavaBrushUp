package StringPrograms;

public class FirstLetterOfEachWord
{
    public static void main(String args[])
    {
        String x = "Shraddha Patil";
        String[] myName = x.split(" ");

        for (int i = 0; i < myName.length; i++)
        {
            String s = myName[i];
            System.out.println(s.charAt(0));
        }
    }

}

