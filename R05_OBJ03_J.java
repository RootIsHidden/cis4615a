import java.util.ArrayList;
import java.util.List;

// Rule 05. Object Orientation (OBJ)
// OBJ03-J. Prevent heap pollution
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/OBJ03-J.+Prevent+heap+pollution
// ============================================================================================
// Non-Compliant Solution - allows heap pollution.

public class R05_OBJ03_J
{
    private static void addToList(List list, Object obj)
    {
        // Unchecked warning
        list.add(obj);
    }
     
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String> ();
        addToList(list, 42);
        // Throws ClassCastException
        System.out.println(list.get(0));
    }
}