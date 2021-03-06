import java.io.DataInputStream;
import java.io.IOException;

// Rule 03. Numeric Types and Operations (NUM)
// NUM03-J. Use integer types that can fully represent the possible range of unsigned data
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
// =====================================================================================================================================================
// Non-Compliant Solution - does not consider signedness of the source.

public class R03_NUM03_J 
{    
    public static int getInteger(DataInputStream is) throws IOException 
    {
        return is.readInt(); 
    }  
}
