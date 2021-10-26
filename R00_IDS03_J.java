import java.util.logging.Logger;

// Rule 00. Input Validation and Data Sanitization (IDS)
// IDS03-J. Do not log unsanitized user input
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
// =======================================================================================================
// Non-Compliant Solution - allows for injection attack.

public class R00_IDS03_J 
{
    private static boolean loginSuccessful = true;
    private static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());;
    private static String username = "guest";

    public static void main(String [] args)
    {
        if (loginSuccessful) 
        {
            logger.severe("User login succeeded for: " + username);
        }
        else
        {
            logger.severe("User login failed for: " + username);
        }
    }   
}
