class stck{
  public stck()
    {
        int num;
    }
    int pos=-1;
    int arr[]=new int [100];
    public void add(int val){
        if(pos<100)
        {
            pos++;
            arr[pos]=val;
        }
        else {
            System.out.println("INVALID INPUT");
        }}
        public void delete(){
            if(pos!=-1){
                pos--;
            }
            else{
                System.out.println("STACK IS EMPTY");
            }
        }
        public void display45()
        {
            for(int i=0;i<=pos;i++){
                System.out.println(arr[i]);
            }
        }
        public boolean seach(int val){
        for(int i=0;i<=pos;i++){
                if(arr[i]==val){
                    return true;
                }
            }return false;
        }
    }
public class Stack {
    public static void main(String[] args) {
        stck st=new stck();
        st.add(10);
        st.add(20);
        st.add(30);
        st.display45();
        st.delete();
        st.display45();
        boolean num2;
        num2=st.seach(20);
        System.out.println(num2);

    }
}
