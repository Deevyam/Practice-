class que{
    que()
    {
        int num;
    }
    int rear;
    int front;
    int arr[]=new int [100];
    int pos=-1;
    public void add(int val){

      if(pos <100) {
          pos++;
        arr[pos]=val;
        front=0;
        rear=pos;

      }
      else{
          System.out.println("INVALID INPUT");
      }
    }
    public void delete(){
      if(pos!=-1)
      {
          front=front+1;
      }
        else{
            System.out.println("INVALID INPUT");
        }
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
    public boolean seach(int val){
        for(int i=front;i<=rear;i++){
            if(arr[i]==val){
                return true;
            }
        }return false;
    }
}

public class Queue {
    public static void main(String[] args) {
    que q=new que();
    q.add(10);
    q.add(20);
    q.add(30);
    q.display();
    q.delete();
    q.display();
    boolean num2;
    num2=q.seach(20);
    System.out.println(num2);
    }
}
