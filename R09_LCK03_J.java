import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Rule 09. Locking (LCK)
// LCK03-J. Do not synchronize on the intrinsic locks of high-level concurrency objects
// Refference: https://wiki.sei.cmu.edu/confluence/display/java/LCK03-J.+Do+not+synchronize+on+the+intrinsic+locks+of+high-level+concurrency+objects
// =================================================================================================================================================
// Compliant Solution - synchronizes on the intrinsic lock of a high-level concurrency objects

public class R09_LCK03_J
{
    private final Lock lock = new ReentrantLock();
 
    public void doSomething()
    {
        lock.lock();
        
        try
        {
            // ...
        }
        finally
        {
            lock.unlock();
        }

    }
}