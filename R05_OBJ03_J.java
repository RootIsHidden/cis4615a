import java.util.ArrayList;
import java.util.List;

// Rule 05. Object Orientation (OBJ)
// OBJ03-J. Prevent heap pollution
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/OBJ03-J.+Prevent+heap+pollution
// ============================================================================================
// Compliant Solution - does not allow heap pollution.

public class R05_OBJ03_J
{
    private static void addToList(List<String> list, String str)
    {
        // No warning generated
        list.add(str);
    }
     
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String> ();
        addToList(list, "42");
        System.out.println(list.get(0));
    }
}