/**
 * The type Multithreading demo.
 */
class MultithreadingDemo extends Thread
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

/**
 * The type Multithreading using extend.
 */
// Main Class
public class multithreadingUsingExtend
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i=0; i<8; i++)
        {
            multithreadingDemo object = new multithreadingDemo();
            object.start();
        }
    }
}

