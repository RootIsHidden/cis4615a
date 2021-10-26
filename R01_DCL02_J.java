import java.util.Arrays;
import java.util.List;

// Rule 01. Declarations and Initialization (DCL)
// DCL02-J. Do not modify the collection's elements during an enhanced for statement
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/DCL02-J.+Do+not+modify+the+collection%27s+elements+during+an+enhanced+for+statement
// ================================================================================================================================================
// Compliant Solution - modifies a collection's element during an enchanced for statement.

public class R01_DCL02_J
{
    public static void main(String [] args)
    {
      List<Integer> list = Arrays.asList(new Integer[] {13, 14, 15});
      boolean first = true;
      
      // This block leaves the actual list unchanged
      System.out.println("Processing list...");
      for (final Integer i: list) 
      {
        Integer item = i;
        if (first) 
        {
          first = false;
          item = new Integer(99);
        }
        System.out.println(" New item: " + item);
        // Process item
      }
      
      System.out.println("Modified list?");
      for (Integer i: list)
      {
        System.out.println("List item: " + i);
      }
    }
}
