package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();//initialize array

        //add elements
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        //access elements

        String fruit=list.get(1);//op banana

        //iterate over elements
        for(String item:list)
        {
            System.out.println(item);
        }
        // Remove elements
        list.remove("Banana");
        System.out.println(fruit);
// Get size
        int size = list.size(); // 2
        System.out.println(size);
// Clear the list
       // list.clear();




    }
}
