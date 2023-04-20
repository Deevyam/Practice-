class thread extends Thread
{
    public void run(){
    int i;
    for(i=1;i<=600;i++)
    {
        System.out.println("start "+i);
    }
    }
}

public class Threding {
    public static void main(String[] args) {
        thread th=new thread();

       th.start();
        System.out.println(" end of thread");
    }
}
