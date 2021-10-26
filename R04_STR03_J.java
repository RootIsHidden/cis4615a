import java.math.BigInteger;

// Rule 04. Characters and Strings (STR)
// STR03-J. Do not encode noncharacter data as a string
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
// =================================================================================================================
// Non-Compliant Solution - converts noncharacter data to a string.

public class R04_STR03_J 
{
    public static void main(String [] args)
    {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
    }
}
