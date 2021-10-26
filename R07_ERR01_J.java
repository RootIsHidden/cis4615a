import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Rule 07. Exceptional Behavior (ERR)
// ERR01-J. Do not allow exceptions to expose sensitive information
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/ERR01-J.+Do+not+allow+exceptions+to+expose+sensitive+information
// =============================================================================================================================
// Compliant Solution - does not allow leaks of sensitive information. Security Policy is implemented.

public class R07_ERR01_J 
{
    public static void main(String[] args)
    {
 
        File file = null;
        try 
        {
            file = new File(System.getenv("APPDATA") + args[0]).getCanonicalFile();
            if (!file.getPath().startsWith("c:\\homepath")) 
            {
                System.out.println("Invalid file");
                return;
            }
        }
        catch (IOException x)
        {
            System.out.println("Invalid file");
            return;
        }
     
        try
        {
            FileInputStream fis = new FileInputStream(file);
        }
        catch (FileNotFoundException x)
        {
            System.out.println("Invalid file");
            return;
        }
    }
}