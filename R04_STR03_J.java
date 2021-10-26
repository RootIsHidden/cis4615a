import java.math.BigInteger;

// Rule 04. Characters and Strings (STR)
// STR03-J. Do not encode noncharacter data as a string
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
// =================================================================================================================
// Compliant Solution - does not convert noncharacter data to a string.

public class R04_STR03_J 
{
    public static void main(String [] args)
    {
        BigInteger x = new BigInteger("530500452766");
        // Valid character data
        String s = x.toString();
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        
        x = new BigInteger(ns); 
    }
}
