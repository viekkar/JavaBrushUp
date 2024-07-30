package StringPrograms;

public class RemoveJunkCharactors
{
    public static void main(String[] args)
    {
        String s="@^&%$#*Selenium !*(&^%& java 123";
        System.out.println(s);
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
