import java.io.IOException;
public class Exception extends Throwable {
    public static void main(String[] args) {
     /* try
        {
            System.in.read();
        }
        catch(IOException exp)
        {

        }*/
        int[] arr=new int[5];
        arr[0]=10;
        arr[2]=20;
        arr[3]=30;
        arr[4]=40;

        try
        {
            arr[5]=50;
        }
        catch( ArrayIndexOutOfBoundsException  exp)
        {
            System.out.println("Check your array bound:"+exp.getMessage());
        }
        System.out.println("Array values");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        }

    public void printStackTrace() {
    }
}

