

class Test
{
    public void show()
    {
        System.out.println("i am show method");
    }
}
class Mythread extends Test implements Runnable
{
    @Override
    public void run()
    {
        int i;
        for(i=1;i<=500;i++)
        {
            System.out.println("value of i is"+i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        System.out.println("starting thread1");
        Thread th=new Thread(mt);
        th.start();
        System.out.println(" end of thread");
    }
}