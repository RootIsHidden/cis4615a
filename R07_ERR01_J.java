import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Rule 07. Exceptional Behavior (ERR)
// ERR01-J. Do not allow exceptions to expose sensitive information
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/ERR01-J.+Do+not+allow+exceptions+to+expose+sensitive+information
// =============================================================================================================================
// Non-Compliant Solution - allows for leaks of sensitive information.

public class R07_ERR01_J 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Linux stores a user's home directory path in
        // the environment variable $HOME, Windows in %APPDATA%
        FileInputStream fis =
            new FileInputStream(System.getenv("APPDATA") + args[0]); 
    }
}
