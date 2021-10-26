// Rule 08. Visibility and Atomicity (VNA)
// VNA00-J. Ensure visibility when accessing shared primitive variables
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/VNA00-J.+Ensure+visibility+when+accessing+shared+primitive+variables
// =================================================================================================================================
// Non-Compliant Solution

final public class R08_VNA00_J implements Runnable 
{
    private boolean done = false;
  
    @Override public void run()
    {
        while (!done)
        {
            try
            {
                // ...
                // Do something
                Thread.currentThread().sleep(1000);
            }
            catch(InterruptedException ie)
            {
                // Reset interrupted status
                Thread.currentThread().interrupt();
            }
        }   
    }

    public void shutdown()
    {
        done = true;
    }
}
